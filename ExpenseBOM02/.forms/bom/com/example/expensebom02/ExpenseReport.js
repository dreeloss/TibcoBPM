/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.expensebom02.ExpenseReport. 
 */ 

com.tibco.data.Loader.currentLoader.load("com.example.expensebom02.ExpenseItems");

com.tibco.data.Loader.classDefiner["com.example.expensebom02.ExpenseReport"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.expensebom02.ExpenseReport");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_REPORTDATE = "reportDate";
theClass.ATTR_CURRENCY = "currency";
theClass.ATTR_EXPENSEITEMS = "expenseitems";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_REPORTDATE] = {type:"BomPrimitiveTypes.Date", baseType:"BomPrimitiveTypes.Date", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CURRENCY] = {type:"com.example.expensebom02.Currency", baseType:"com.example.expensebom02.Currency", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EXPENSEITEMS] = {type:"com.example.expensebom02.ExpenseItems", baseType:"com.example.expensebom02.ExpenseItems", primitive:false, multivalued:true, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_REPORTDATE, theClass.ATTR_CURRENCY];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [theClass.ATTR_EXPENSEITEMS];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_REPORTDATE, theClass.ATTR_CURRENCY, theClass.ATTR_EXPENSEITEMS];

theClass.getName = function() {
    return "com.example.expensebom02.ExpenseReport";
};

theClass._hasAttribute = function(attName) {
	return this.TYPE_ARRAY[attName] != null;
};

theClass._getAttributes = function() {
	return this.ATTRIBUTE_NAMES;
};


theClass._getCompositeAttributes = function() {
    return this.COMPOSITE_ATTRIBUTE_NAMES;
};

theClass._getPrimitiveAttributes = function() {
    return this.PRIMITIVE_ATTRIBUTE_NAMES;
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
		throw("Attribute " + attName + " not recognized for class com.example.expensebom02.ExpenseReport");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.expensebom02.ExpenseReport");
};

theClass.prototype.getReportDate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.ExpenseReport").ATTR_REPORTDATE, useInternal);
};

theClass.prototype.setReportDate = function(reportDate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.ExpenseReport").ATTR_REPORTDATE, reportDate);
};


theClass.prototype.getCurrency = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.ExpenseReport").ATTR_CURRENCY, useInternal);
};

theClass.prototype.setCurrency = function(currency) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.ExpenseReport").ATTR_CURRENCY, currency);
};


theClass.prototype.getExpenseitems = function() {
    return this._getComplexArrayAttribute(this.loader.getClass("com.example.expensebom02.ExpenseReport").ATTR_EXPENSEITEMS);
};

theClass.prototype.setExpenseitems = function(expenseitems) {
    throw("unsupported array attribute: expenseitems");
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

};

com.tibco.data.Loader.classDefiner["com.example.expensebom02.ExpenseReport"]();
