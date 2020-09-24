package com.company;

public class Main {

    public static void main(String[] args) {

        // THIS AND SUPER KEYWORDS

	    // The keyword super is used to access parent class variables
        // and methods.

        // The keyword this is used to access current class variables
        // and methods. This is useful when we want to invoke a
        // variable or method in the current class only, rather than
        // run the risk of invoking a variable or method of the same name
        // from its parent class.

        // The keyword this is commonly used with constructors and
        // setters, and optionally in getters. This is because constructors
        // and setters take parameters of the same name as the private
        // variable they're assigning a value to.

        // The keyword super is commonly used with method overriding, when
        // we call a method with the same name from a parent class.
        // Using our Superclass and SubClass classes as examples, if our
        // SubClass printMethod() didn't call super.printMethod(), then
        // it would result in an infinite loop of calling itself.


        // THIS() AND SUPER() METHODS

        // The this() method call is only used in constructors, and must
        // be used as the first statement in a constructor. It is used
        // to chain constructors - when one constructor is used to call
        // another constructor in the same class.

        // The super() method is used to call a parent constructor.
        // The super() method must be the first statement in each
        // constructor.

        // A constructor can have a call to super() or this() but
        // it can NEVER HAVE BOTH.


        // MULTIPLE CONSTRUCTORS

        // Where you have multiple constructors, the main constructor
        // should be one that takes parameters for all a classes private
        // variables and assigns them values from those parameters.

        // Any further constructors should use the this() method to call
        // the main constructor and pass any values it takes to the main
        // constructor.

        // This means that no matter what constructor we call, the main
        // constructor has the "responsibility" for initialising variables.

        // When setting up multiple constructors in a child class
        // the main constructor calls the constructor of a parent class
        // using the super() method, and any further constructors in the
        // child class should use the this() method to reference its
        // main constructor and pass values as parameter to its parent
        // constructor in this way.
    }
}
