package com.company;

public class Main {

    public static void main(String[] args) {

        // OVERLOADING

	    // Method overloading means providing two or more methods in a
        // class with the same name but different parameters.
        // They may have different return data types.

        // This allows us to use the same method name for what are fundamentally
        // identical blocks of logic with the same purpose. It means we
        // are not duplicating code.

        // Method overloading has nothing to do with polymorphism but
        // Java developers often refer to overloading as "Compile Time
        // Polymorphism".

        // Static and instance methods can be overloaded.

        // Overloading usually happens inside a single class, but a
        // method can also be treated as overloaded in any subclasses
        // of that class.

        // This is due to the fact that a subclass inherits one version
        // of the method from its parent class and then the subclass can
        // have another overloaded version of that inherited method.


        // OVERLOADING RULES

        // Methods will be considered to be overloaded if it satisfies
        // both of the following conditions:
        // A. the methods share the same name
        // B. the methods have different parameters

        // If methods satisfy the conditions to be overloaded, then they
        // may or may not:
        // 1. have different return data types
        // 2. have different access modifiers
        // 3. Throw different checked or unchecked exceptions


        // METHOD OVERRIDING

        // Method overriding is defining a method in a child class that
        // already exists by the same name in its parent class.

        // Method overriding is also known as "Runtime Polymorphism" and
        // "Dynamic Method Dispatch".

        // When overriding a method it's recommended to put the @Override
        // annotation above the method definition.
        // This allows the compiler to show us an error if we're not
        // following overriding rules correctly.

        // Only instance methods can be overwritten.


        // METHOD OVERRIDING RULES

        // Methods will be considered overriding if they satisfy these
        // conditions:
        // A. Must have same name and arguments
        // B. Return type can be a subclass of the return type in the
        // parent class
        // C. It can't have a lower access modifier - e.g. if a parent
        // method uses the protected access modifier then using the
        // private access modifier in the child method would not be allowed,
        // however using the public access modifier would be allowed.

        // Additional things to consider:
        // 1. Only inherited methods can be overridden.
        // 2. Constructors and private methods cannot be overridden.
        // 3. Methods that are final cannot be overridden.
        // 4. A subclass can use super.methodName() to call the superclass
        // version of an overridden method


    }
}
