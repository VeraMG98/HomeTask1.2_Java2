package com.company;

public final class Audi extends Car {

    private final boolean suv;

    public Audi(String type, String model, boolean suv, Ability ability) {
        super(type, model, ability);
        this.suv = suv;
    }

    public boolean isSuv() {
        return suv;
    }

    public final String printInfo() {
        return super.printInfo() + " "
                + " suv: " + suv;
    }
}
