package com.company;

public class Burger {

    private String name;
    private String rollType;
    private String meat;
    private String additionOne;
    private String additionTwo;
    private String additionThree;
    private String additionFour;
    private double burgerPrice;
    private double additionOnePrice = 0.0;
    private double additionTwoPrice = 0.0;
    private double additionThreePrice = 0.0;
    private double additionFourPrice = 0.0;

    public Burger(String name, String rollType, String meat, double burgerPrice) {
        this.name = name;
        this.rollType = rollType;

        if (meat.equals("beef") || meat.equals("pork") || meat.equals("lamb") || meat.equals("chicken") || meat.equals("bean") || meat.equals("falafel")){
            this.meat = meat;
        } else {
            this.meat = "beef";
        }

        if(burgerPrice > 0.0){
            this.burgerPrice = burgerPrice;
        } else {
            this.burgerPrice = 10.0;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollType() {
        return rollType;
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        if (meat.equals("beef") || meat.equals("pork") || meat.equals("lamb") || meat.equals("chicken") || meat.equals("bean") || meat.equals("falafel")){
            this.meat = meat;
        } else {
            System.out.println("Invalid meat type.");
        }
    }

    public String getAdditionOne() {
        return additionOne;
    }

    public void setAdditionOne(String additionOne) {
        this.additionOne = additionOne;
    }

    public String getAdditionTwo() {
        return additionTwo;
    }

    public void setAdditionTwo(String additionTwo) {
        this.additionTwo = additionTwo;
    }

    public String getAdditionThree() {
        return additionThree;
    }

    public void setAdditionThree(String additionThree) {
        this.additionThree = additionThree;
    }

    public String getAdditionFour() {
        return additionFour;
    }

    public void setAdditionFour(String additionFour) {
        this.additionFour = additionFour;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public void setBurgerPrice(double burgerPrice) {
        if (burgerPrice > 0.0){
            this.burgerPrice = burgerPrice;
        } else {
            System.out.println("Invalid burger price.");
        }

    }

    public double getAdditionOnePrice() {
        if (!additionOne.equals("")){
            return additionOnePrice;
        } else {
            return -1;
        }

    }

    public void setAdditionOnePrice(double additionOnePrice) {
        if (additionOnePrice > 0.0) {
            this.additionOnePrice = additionOnePrice;
        } else {
            System.out.println("Invalid addition price.");
        }

    }

    public double getAdditionTwoPrice() {
        if (!additionTwo.equals("")){
            return additionTwoPrice;
        } else {
            return -1;
        }
    }

    public void setAdditionTwoPrice(double additionTwoPrice) {
        if (additionTwoPrice > 0.0) {
            this.additionTwoPrice = additionTwoPrice;
        } else {
            System.out.println("Invalid addition price.");
        }
    }

    public double getAdditionThreePrice() {
        if (!additionThree.equals("")){
            return additionThreePrice;
        } else {
            return -1;
        }
    }

    public void setAdditionThreePrice(double additionThreePrice) {
        if (additionThreePrice > 0.0) {
            this.additionThreePrice = additionThreePrice;
        } else {
            System.out.println("Invalid addition price.");
        }
    }

    public double getAdditionFourPrice() {
        if (!additionFour.equals("")){
            return additionFourPrice;
        } else {
            return -1;
        }
    }

    public void setAdditionFourPrice(double additionFourPrice) {
        if (additionFourPrice > 0.0) {
            this.additionFourPrice = additionFourPrice;
        } else {
            System.out.println("Invalid addition price.");
        }
    }

    public void getTotalPrice() {
        System.out.println(meat + " burger price = " + burgerPrice);

        if (!additionOne.equals("")) {
            System.out.println(additionOne + " price = " + additionOnePrice);
        }

        if (!additionTwo.equals("")) {
            System.out.println(additionTwo + " price = " + additionTwoPrice);
        }

        if (!additionThree.equals("")) {
            System.out.println(additionThree + " price = " + additionThreePrice);
        }

        if (!additionFour.equals("")) {
            System.out.println(additionFour + " price = " + additionFourPrice);
        }

    }
}
