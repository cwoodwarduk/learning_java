package com.company;

public class DeluxeBurger extends Burger {

    public DeluxeBurger(String name, String rollType, String meat, double burgerPrice) {
        super("Deluxe Burger", rollType, meat, 14.0);
        setAdditionOne("chips");
        setAdditionOnePrice(4.0);
        setAdditionTwo("drink");
        setAdditionTwoPrice(3.0);
    }

    @Override
    public void setAdditionOne(String additionThree){
        System.out.println("No further additions allowed.");
    }

    @Override
    public void setAdditionTwo(String additionFour){
        System.out.println("No further additions allowed.");
    }

    @Override
    public void setAdditionThree(String additionThree){
        System.out.println("No further additions allowed.");
    }

    @Override
    public void setAdditionFour(String additionFour){
        System.out.println("No further additions allowed.");
    }

    @Override
    public void setAdditionOnePrice(double additionThreePrice) {
        System.out.println("No further additions allowed.");
    }

    @Override
    public void setAdditionTwoPrice(double additionFourPrice) {
        System.out.println("No further additions allowed.");
    }

    @Override
    public void setAdditionThreePrice(double additionThreePrice) {
        System.out.println("No further additions allowed.");
    }

    @Override
    public void setAdditionFourPrice(double additionFourPrice) {
        System.out.println("No further additions allowed.");
    }

}
