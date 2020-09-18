package com.company;

public class Main {

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber two = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(two);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        two.subtract(one);
        System.out.println("number.real= " + two.getReal());
        System.out.println("number.imaginary= " + two.getImaginary());
    }
}
