/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.expensebom02.Department. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.expensebom02.Department"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.expensebom02.Department");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_DEPTCODE = "deptCode";
theClass.ATTR_DEPTNAME = "deptName";
theClass.ATTR_MANAGERID = "managerId";
theClass.ATTR_LOCATION = "location";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_DEPTCODE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DEPTNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_MANAGERID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_LOCATION] = {type:"com.example.expensebom02.OfficeLocations", baseType:"com.example.expensebom02.OfficeLocations", primitive:true, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_DEPTCODE, theClass.ATTR_DEPTNAME, theClass.ATTR_MANAGERID, theClass.ATTR_LOCATION];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_DEPTCODE, theClass.ATTR_DEPTNAME, theClass.ATTR_MANAGERID, theClass.ATTR_LOCATION];

theClass.getName = function() {
    return "com.example.expensebom02.Department";
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
		throw("Attribute " + attName + " not recognized for class com.example.expensebom02.Department");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.expensebom02.Department");
};

theClass.prototype.getDeptCode = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Department").ATTR_DEPTCODE, useInternal);
};

theClass.prototype.setDeptCode = function(deptCode) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Department").ATTR_DEPTCODE, deptCode);
};


theClass.prototype.getDeptName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Department").ATTR_DEPTNAME, useInternal);
};

theClass.prototype.setDeptName = function(deptName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Department").ATTR_DEPTNAME, deptName);
};


theClass.prototype.getManagerId = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Department").ATTR_MANAGERID, useInternal);
};

theClass.prototype.setManagerId = function(managerId) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Department").ATTR_MANAGERID, managerId);
};


theClass.prototype.getLocation = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Department").ATTR_LOCATION, useInternal);
};

theClass.prototype.setLocation = function(location) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.expensebom02.Department").ATTR_LOCATION, location);
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

com.tibco.data.Loader.classDefiner["com.example.expensebom02.Department"]();
