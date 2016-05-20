/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.expensebom02.Manager. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.expensebom02.Manager"] = function() {

/**
 * Constructor.
 */
var theClass = function(context) {
	this.data = new Object();
	this.isParameter = false;
    if (context == null) {
    	this.detached = true;
    } else  {
    	this.detached = (context.item == null);
		this.dataStore = context.dataStore;
		this.item = context.item;
		this.logger = context.logger;
		this.id = context.id;
		this.form = context.form;
		this.loader = this.form._loader;
        this.parentWrapper = context.parentWrapper;
	}
};

theClass.LOADER = com.tibco.data.Loader.currentLoader;
theClass.LOADER.registerClass(theClass, "com.example.expensebom02.Manager");

theClass.LOADER.load("com.example.expensebom02.Employee");
var callback = function() {

theClass.ATTR_APPROVALLIMIT = "approvalLimit";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_APPROVALLIMIT] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_APPROVALLIMIT];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_APPROVALLIMIT];

theClass.getName = function() {
    return "com.example.expensebom02.Manager";
};

theClass._hasAttribute = function(attName) {
    return ( this.TYPE_ARRAY[attName] != null ) || 
    this.LOADER.getClass("com.example.expensebom02.Employee")._hasAttribute(attName);
};

theClass._getAttributes = function() {
    return this.ATTRIBUTE_NAMES.concat(this.LOADER.getClass("com.example.expensebom02.Employee")._getAttributes());
};


theClass._getCompositeAttributes = function() {
    return this.COMPOSITE_ATTRIBUTE_NAMES.concat(this.LOADER.getClass("com.example.expensebom02.Employee")._getCompositeAttributes());
};

theClass._getPrimitiveAttributes = function() {
    return this.PRIMITIVE_ATTRIBUTE_NAMES.concat(this.LOADER.getClass("com.example.expensebom02.Employee")._getPrimitiveAttributes());
};

theClass._isAttributeMultivalued = function(attName) {
	return this._getTypeDef(attName).multivalued;
};

theClass._isAttributeRequired = function(attName) {
    return this._getTypeDef(attName).required;
};

theClass._getTypeDef = function(attName) {
    var attType = this.TYPE_ARRAY[attName];
    if (attType == null)
        attType = this.LOADER.getClass("com.example.expensebom02.Employee")._getTypeDef(attName);  
	if (attType == null)
		throw("Attribute " + attName + " not recognized for class com.example.expensebom02.Manager");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.expensebom02.Manager");
};

theClass.prototype.getApprovalLimit = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Manager").ATTR_APPROVALLIMIT, useInternal);
};

theClass.prototype.setApprovalLimit = function(approvalLimit) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Manager").ATTR_APPROVALLIMIT, approvalLimit);
};

theClass.getAttributeNames = function() {
    return theClass._getAttributes();
};

theClass.getPrimitiveAttributeNames = function() {
    return theClass._getPrimitiveAttributes();
};

theClass.getComplexAttributeNames = function() {
    return theClass._getCompositeAttributes();
};

theClass.getAttributeType = function(attName) {
    return this._getTypeDef(attName).type;
};

theClass.isAttributeMultivalued = function(attName) {
    return theClass._isAttributeMultivalued(attName);
};

theClass.isAttributePrimitive = function(attName) {
    return this._getTypeDef(attName).primitive;
};

theClass.prototype.getAttributeValue = function(attName) {
    var isSingle = !theClass.isAttributeMultivalued(attName);
    var isPrimitive = theClass.isAttributePrimitive(attName);
    if (isSingle) {
        if (isPrimitive) {
            return this._getPrimitiveAttribute(attName);
        } else {
            return this._getComplexAttribute(attName);
        }
    } else {
        if (isPrimitive) {
            return this._getPrimitiveArrayAttribute(attName);
        } else {
            return this._getComplexArrayAttribute(attName);
        }
    }    
};

theClass.prototype.setAttributeValue = function(attName, value) {
    var isSingle = !theClass.isAttributeMultivalued(attName);
    var isPrimitive = theClass.isAttributePrimitive(attName);
    if (isSingle) {
        if (isPrimitive) {
            this._setPrimitiveAttribute(attName, value);
        } else {
            this._setComplexAttribute(attName, value);
        }
    } else {
        if (isPrimitive) {
            this._setPrimitiveAttribute(attName, value);
        } else {
            throw("Cannot set child List for attribute \"" + attName + "\". You can only modify the existing List");
        }
    }    
};

}
if (com.tibco.data.Loader.extendClass300)
	com.tibco.data.Loader.extendClass300("com.example.expensebom02.Employee", theClass, callback);
else {
	com.tibco.data.Loader.extendClass(theClass.LOADER.getClass("com.example.expensebom02.Employee"), theClass);
	callback();
}
};

com.tibco.data.Loader.classDefiner["com.example.expensebom02.Manager"]();
