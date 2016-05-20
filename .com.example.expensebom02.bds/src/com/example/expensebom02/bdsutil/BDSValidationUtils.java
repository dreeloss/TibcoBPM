/*
* ENVIRONMENT:    Java Generic
*
* COPYRIGHT:      (C) 2011 TIBCO Software Inc
*/
package com.example.expensebom02.bdsutil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;


/**
 * Utility class that deals with an alternate validation using the
 * validation of XML built into Java (SAX)
 */
public class BDSValidationUtils {

    private static final String schemaFilenames[] = new String[] { "/model/validation/com.example.expensebom02.xsd" };

    private static final String schemaNamespaces[] = new String[] { "http://example.com/expensebom02" };

    private static final String XSITYPE = "xsi:type";
    
    private static final String XMLNS = "xmlns";
    
    /**
     * Method that can be used to create an instance of the BDS Validation Class
     * 
     * @return  An instance of the BDS Validation Class
     */
    public static BDSValidationUtils init()
    {
        return new BDSValidationUtils();
    }
    
    /**
     * Validation method that will use Java's SAX parser to validate XML
     * 
     * @param xmlToValidate     String of XML to validate against the schema
     * @return
     * @throws SAXException     Validation failure error message
     */
    public boolean validate( String xmlToValidate ) throws SAXException
    {
        // Create a SchemaFactory capable of understanding WXS schemas.
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        // Load a WXS schema, represented by a Schema instance.
        Source schemaFiles[] = new Source[schemaFilenames.length];

        for (int i = 0; i < schemaFiles.length; i++) {
            schemaFiles[i] = new StreamSource(getClass().getResourceAsStream(schemaFilenames[i]));          
        }

        Schema schema = factory.newSchema(schemaFiles);
        boolean validationReturn = true;

        try {
            validationReturn = performValidate(schema, xmlToValidate);
        } catch (SAXParseException e) {
            // Validation failed, this may be because there was an xsi:type
            // reference that we do not know about
            String newXML = removeUnknownNamespaces(xmlToValidate);

            // No change to the already attempted XML
            if (newXML == null) {
                throw e;
            }

            validationReturn = performValidate(schema, newXML);
        }

        return validationReturn;
    }
    
    /**
     * Given a schema and some XML checks that the XML is valid against the
     * given schema
     * 
     * @param schema
     *            XSD Schema content
     * @param xmlToValidate
     *            XML content
     * @return True if valid, otherwise false
     * @throws SAXException
     */
    private boolean performValidate(Schema schema, String xmlToValidate)
            throws SAXException {
        // Parse an XML document into a DOM tree.
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        parserFactory.setSchema(schema);
        parserFactory.setNamespaceAware(true);
        // parserFactory.setValidating(true);

        try {
            StringReader stringReader = new StringReader(xmlToValidate);
            InputSource inputSource = new InputSource(stringReader);

            SAXParser SAXparser = parserFactory.newSAXParser();
            XMLReader reader = SAXparser.getXMLReader();

            // There are 3 options of Source that could be used,
            // each shows different performance
            // SAXSource - Fastest
            // DOMSource - Standard
            // StAXSource - Slowest
            SAXSource source = new SAXSource(reader, inputSource);

            // Create a Validator object, which can be used to validate
            // an instance document.
            Validator validator = schema.newValidator();

            // Validate the DOM tree.
            validator.validate(source);

            // These exception mean that setting up the external validation
            // has failed, rather than throw a mix of different exception
            // the interface will return a boolean to highlight if alternate
            // validation was used.
        } catch (ParserConfigurationException e) {
            return false;
        } catch (IOException e) {
            return false;
        }

        // If it reaches here, then the XML is valid as it passed validation
        // without a SAXException, or a validation setup failure
        return true;
    }

    /**
     * Builds a map of all xmlns declarations found in attributes
     * of the supplied element. The mapping is from prefix to NS URI.
     * @param elem
     * @return
     */
    private Map<String, String> getXMLNSDeclarationsFromElement(Element elem) {
        Map<String, String> prefixToURIMap = new HashMap<String, String>();
        for (int i = 0; i < elem.getAttributes().getLength(); i++) {
            Node attribItem = elem.getAttributes().item(i);
            String[] splitNS = attribItem.getNodeName().split(":");
            if (splitNS.length > 1) {
                if (splitNS[0].equals(XMLNS)) {
                    String nsPrefix = splitNS[1];
                    String nsURI = attribItem.getNodeValue();
                    prefixToURIMap.put(nsPrefix, nsURI);
                }
            }
        }     
        return prefixToURIMap;
    }

    /**
     * Extracts the xsi:type NS prefix from the supplied Element.
     * e.g. if xsi:type="hello:world", this returns "hello". If no
     * XSI type is present, or the type is unqualified (e.g. just
     * "world"), then null is returned
     * @param elem
     * @return
     */
    private String getXSITypeAttributeNSPrefixFromElement(Element elem) {
        String xsiTypeNSPrefix = null; 
        for (int i = 0; i < elem.getAttributes().getLength(); i++) {
            Node attribItem = elem.getAttributes().item(i);
            if (attribItem.getNodeName().equals(XSITYPE)) {
                String xsiType = attribItem.getNodeValue();
                String[] xsiTypeFragments = xsiType.split(":");
                // If length is 1, we do nothing as it's
                // a local type name (no prefix).
                if (xsiTypeFragments.length > 1) {
                    // The first fragment is a NS prefix
                    xsiTypeNSPrefix = xsiTypeFragments[0];
                }
                // Can only have one xsi:type, so stop searching
                break;
            }
        }
        return xsiTypeNSPrefix;
    }
    
    /**
     * Removes xsi:type attributes from the supplied element (and children) where
     * the namespace does not match one known at design-time. In other words, 
     * namespaces that we can't validate against. If the namespace DOES match,
     * the xsi:type is left in.  Also, if the xsi:type contains a namespace prefix
     * this is not in scope (i.e. invalid XML) it is deliberately left in,
     * allowing subsequence XML validation to fail meaningfully.
     * @param elem this element and its children are processed
     * @param prefixToURIMap a map of in-scope namespace mappings for the supplied element's parent
     * @param visitedElements elements to NOT recurse into, safeguarding against recursion loops
     * @return true if any changes were made to the DOM
     */
    private boolean removeUnknownXSITypes(Element elem, Map<String, String> prefixToURIMap, 
            List<Element> visitedElements) {
        
        visitedElements.add(elem);
        boolean madeChange = false;
        // Construct a map of ns prefix to URI mapping. This consists of any that
        // are passed in (i.e. already in scope from further up the tree), plus
        // additions (or replacements/overrides, if the prefix matches) from this
        // node.
        Map<String, String> localPrefixToURIMap = new HashMap<String, String>();
        localPrefixToURIMap.putAll(prefixToURIMap);
        // Now add any found in this node
        localPrefixToURIMap.putAll(getXMLNSDeclarationsFromElement(elem));
        
        String xsiTypeNSPrefix = getXSITypeAttributeNSPrefixFromElement(elem);
        if (xsiTypeNSPrefix != null) {
            String xsiTypeNSURI = localPrefixToURIMap.get(xsiTypeNSPrefix);
            // If we found the type URI in our map, determine whether it matches
            // one we knew at design-time. 
            if (xsiTypeNSURI != null) {
                boolean nameSpaceIsKnown = false;
                // If this URI wasn't known at design-time, 
                // we'll remove the xsi:type attribute.
                for (int j=0; j < schemaNamespaces.length && !nameSpaceIsKnown; j++) {
                    nameSpaceIsKnown = xsiTypeNSURI.equals(schemaNamespaces[j]);
                }
                if (!nameSpaceIsKnown) {
                    // We didn't know about this namespace at
                    // design-time, so can't validate against it,
                    // so strip out the xsi:type
                    elem.getAttributes().removeNamedItem(XSITYPE);
                    madeChange = true;
                }
            }
        }
        
        // Recurse down XML tree
        for (int i=0; i < elem.getChildNodes().getLength(); i++) {
            Node childNode = elem.getChildNodes().item(i);
            if (childNode instanceof Element) {
                Element childElement = (Element) childNode;
                // This is a defensive measure against unexpected circular references in 
                // the DOM creating infinite recursion.
                if (!visitedElements.contains(childElement)) {
                    boolean madeChildChange = removeUnknownXSITypes((Element) childNode, 
                            localPrefixToURIMap, visitedElements);
                    madeChange = madeChange || madeChildChange;
                }
            }
        }
        return madeChange;
    }
    
    /**
     * Searches the XML to remove any occurrences of xsi:type that reference
     * schemas we do not know about.
     * 
     * @param xmlToValidate
     *            Original XML
     * @return Purged XML, or null if no different
     */
    private String removeUnknownNamespaces(String xmlToValidate) {

        String newXmlToValidate = null;

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document parse = db.parse(new ByteArrayInputStream(xmlToValidate
                    .getBytes("UTF-8")));

            Element documentElement = parse.getDocumentElement();

            // Check the empty XML case
            if (documentElement == null) {
                return null;
            }

            boolean xmlDataChanged = removeUnknownXSITypes(documentElement, 
                    new HashMap<String, String>(), new ArrayList<Element>());

            // Only return the new XML if it has changed
            if (xmlDataChanged != false) {
                Transformer transformer = TransformerFactory.newInstance()
                        .newTransformer();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                transformer.transform(new DOMSource(parse), new StreamResult(
                        outputStream));
                // Store the new XML
                newXmlToValidate = outputStream.toString("UTF-8");
            }
        } catch (Exception e) {
            // If any of these operations fail - we just want to return that
            // there is no alternate XML to attempt to validate
            newXmlToValidate = null;
        }

        return newXmlToValidate;
    }
}
