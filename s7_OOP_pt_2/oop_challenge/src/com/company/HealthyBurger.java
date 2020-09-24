package com.company;

public class HealthyBurger extends Burger {

    private String additionFive;
    private String additionSix;
    private double additionFivePrice;
    private double additionSixPrice;

    public HealthyBurger(String name, String rollType, String meat, double burgerPrice) {
        super("Healthy Burger", "Rye Bread Roll", meat, burgerPrice);
    }

    public String getAdditionFive() {
        return additionFive;
    }

    public void setAdditionFive(String additionFive) {
        this.additionFive = additionFive;
    }

    public String getAdditionSix() {
        return additionSix;
    }

    public void setAdditionSix(String additionSix) {
        this.additionSix = additionSix;
    }

    public double getAdditionFivePrice() {
        if (!additionFive.equals("")){
            return additionFivePrice;
        } else {
            return -1;
        }
    }

    public void setAdditionFivePrice(double additionFivePrice) {
        if (additionFivePrice > 0.0) {
            this.additionFivePrice = additionFivePrice;
        } else {
            System.out.println("Invalid addition price.");
        }
    }

    public double getAdditionSixPrice() {
        if (!additionSix.equals("")){
            return additionSixPrice;
        } else {
            return -1;
        }
    }

    public void setAdditionSixPrice(double additionSixPrice) {
        if (additionSixPrice > 0.0) {
            this.additionSixPrice = additionSixPrice;
        } else {
            System.out.println("Invalid addition price.");
        }
    }

    @Override
    public void getTotalPrice() {
        super.getTotalPrice();

        if (!additionFive.equals("")) {
            System.out.println(additionFive + " price = " + additionFivePrice);
        }

        if (!additionSix.equals("")) {
            System.out.println(additionSix + " price = " + additionSixPrice);
        }
    }
}
