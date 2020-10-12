package com.company;

public class Main {

    public static void main(String[] args) {
	    // Interfaces specify methods that a class that implements
        // the interface must use.
        // Interfaces are abstract - there's no actual methods within
        // them, you just supply the method names and parameters required.
        // Interfaces are used to create a common behaviour that can
        // be used by several classes to standardise the way a particular
        // set of classes is used.

        // An interface is a commitment or contract that methods and
        // variables in a class will stick to one type ("signature").
        // This prevents us from breaking code.

        ITelephone calumsPhone;
        calumsPhone = new DeskPhone(123456);
        calumsPhone.powerOn();
        calumsPhone.callPhone(123456);
        calumsPhone.answer();

        calumsPhone = new MobilePhone(678902);
        calumsPhone.powerOn();
        calumsPhone.callPhone(678902);
        calumsPhone.answer();

        // Important to note is that Interfaces are not the same thing as
        // a parent class.
        // For example, it could be argued that a smartphone is simply a
        // computer with phone-like functionality built in.
        // Therefore both a laptop and a smartphone could extend a parent
        // Computer class, but the smartphone would implement the same Phone
        // interface as a desk phone.

        // Interfaces are particularly important in Java as, opposed to languages
        // like C++, Java cannot inherit from multiple classes but can implement
        // multiple interfaces.
    }
}
