package com.company;

public class SubClass extends SuperClass {
    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed from SubClass");
    }
}
