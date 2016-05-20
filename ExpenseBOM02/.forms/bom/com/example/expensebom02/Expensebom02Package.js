/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the package class com.example.expensebom02.Expensebom02Package.
 */

com.tibco.data.Loader.classDefiner["com.example.expensebom02.Expensebom02Package"] = function() {

/**
 * Constructor.
 */
var theClass = function() {
};

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.example.expensebom02.Expensebom02Package");

// Define the enumerations declared by this package.
theClass.Currency = ["USD", "GBP", "AUD", "EUR"];
theClass.Currency.USD = "USD";
theClass.Currency.GBP = "GBP";
theClass.Currency.AUD = "AUD";
theClass.Currency.EUR = "EUR";
theClass.getCurrency = function() {
    return this.Currency;
};
theClass.OfficeLocations = ["PALOALTO", "SWINDON", "SYDNEY", "PARIS"];
theClass.OfficeLocations.PALOALTO = "PALOALTO";
theClass.OfficeLocations.SWINDON = "SWINDON";
theClass.OfficeLocations.SYDNEY = "SYDNEY";
theClass.OfficeLocations.PARIS = "PARIS";
theClass.getOfficeLocations = function() {
    return this.OfficeLocations;
};
theClass.ExpenseCodes = ["ENT01", "ACC02", "MEA03", "TAX04", "FLI05", "MIS06"];
theClass.ExpenseCodes.ENT01 = "ENT01";
theClass.ExpenseCodes.ACC02 = "ACC02";
theClass.ExpenseCodes.MEA03 = "MEA03";
theClass.ExpenseCodes.TAX04 = "TAX04";
theClass.ExpenseCodes.FLI05 = "FLI05";
theClass.ExpenseCodes.MIS06 = "MIS06";
theClass.getExpenseCodes = function() {
    return this.ExpenseCodes;
};

// Load the classes defined by this package.
com.tibco.data.Loader.currentLoader.load("com.example.expensebom02.Manager");
com.tibco.data.Loader.currentLoader.load("com.example.expensebom02.Employee");
com.tibco.data.Loader.currentLoader.load("com.example.expensebom02.ExpenseReport");
com.tibco.data.Loader.currentLoader.load("com.example.expensebom02.ExpenseItems");
com.tibco.data.Loader.currentLoader.load("com.example.expensebom02.Department");

// Load the associated factory.
com.tibco.data.Loader.currentLoader.load("com.example.expensebom02.Expensebom02Factory");

};

com.tibco.data.Loader.classDefiner["com.example.expensebom02.Expensebom02Package"]();
