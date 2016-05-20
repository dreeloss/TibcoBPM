/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.example.expensebom02.Expensebom02Factory. 
 */ 

com.tibco.data.Loader.classDefiner["com.example.expensebom02.Expensebom02Factory"] = function() {

/**
 * Constructor.
 */
var theClass = function(form) {
    this.context = new Object();
    this.context.form = form;
    this.context.dataStore = form.getDataStore();
    this.context.logger = form.getLogger();
    this.context.item = null;
    this.context.id = null;
    this.loader = form._loader;
};

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.example.expensebom02.Expensebom02Factory");

theClass.prototype.SUPPORTED_CLASSES = ["com.example.expensebom02.Manager", "com.example.expensebom02.Employee", "com.example.expensebom02.ExpenseReport", "com.example.expensebom02.ExpenseItems", "com.example.expensebom02.Department"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.example.expensebom02.Expensebom02Factory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createManager = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.Manager", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateManager = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.Manager", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createEmployee = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.Employee", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateEmployee = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.Employee", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createExpenseReport = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.ExpenseReport", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateExpenseReport = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.ExpenseReport", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createExpenseItems = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.ExpenseItems", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateExpenseItems = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.ExpenseItems", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createDepartment = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.Department", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateDepartment = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.expensebom02.Department", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.example.expensebom02.Expensebom02Factory"]();
