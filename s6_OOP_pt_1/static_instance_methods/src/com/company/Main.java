package com.company;

public class Main {

    public static void main(String[] args) {

        // STATIC METHODS

	    // Static methods can't access instance methods and instance
        // variables directly.
        // They're usually used for operations that don't require any data
        // from the current instance of the class.

        // We cannot use the this keyword within static methods.
        // Any method that does not use instance variables should be
        // declared static.
        // In other words, if the method uses only static variables and methods,
        // that is, the variables and methods it calls are shared among all
        // instances of that class rather than each instance of a class having
        // its own instances of those methods and variables, then it should be
        // considered static.


        // INSTANCE METHODS

        // Instance methods belong to an instance of a class.
        // To use an instance method we have to instantiate the class
        // first, usually by using the new keyword.

        // Instance methods can access other instance methods and instance
        // variables directly.
        // Instance methods can also access static methods and static
        // variables directly.


        // SHOULD A METHOD BE STATIC?

        // Does it use any fields (instance variables) or instance methods?
        // YES - it should probably be an instance method.
        // NO - it should probably be a static method.

    }
}
