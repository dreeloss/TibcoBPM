package com.example.expensebom02.bdsutil;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Utility methods relating to copying objects
 * 
 * @author smorgan
 * 
 */
public class BDSCopyUtil {

	private static final DatatypeFactory factory;
	
	static {
		try {
			factory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            // Implies a badly configured Java environment
            throw new RuntimeException(e);
		}
	}
	
    public static Object copyIfMutable(Object obj) {
        Object result = obj;
        if ((obj != null) && (obj instanceof XMLGregorianCalendar)) {
                result =
                	factory.newXMLGregorianCalendar(((XMLGregorianCalendar) obj)
                                        .toXMLFormat());
        }
        return result;
    }
}
