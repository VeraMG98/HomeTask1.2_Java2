package com.company;

public final class Audi extends Car {
    private final boolean suv;
    private String copy;

    public Audi(String type, Shop shop, String model , boolean suv) {
        super(type, shop, model);
        this.suv = suv;
        copy = "";
    }

    public boolean isSuv() {
        return suv;
    }

    public final String printInfo() {
        return super.printInfo() + " "
                + " suv: " + suv + " " + copy;
    }

    public void copy(Transport transport) {
        if (transport.getAbility() == this.getAbility())
            copy = " New info: " + transport.getType() + " " + getShop().getShopName() + " " + getShop().getShopAddress();
        else
            System.out.println("No equals");
    }
}
