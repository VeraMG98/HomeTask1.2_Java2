package com.company;

public class Car extends Transport {
    private String model;

    public Car() {
    }

    public Car(String type, Shop shop) {
        super(type, shop, Ability.DRIVE);
    }

    public Car(String type, Shop shop, String model){
        super(type, shop, Ability.DRIVE);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void printAbilityForType(){
        System.out.println("DRIVE");
    }

    public void printAbilityForType(Ability ability) {
        System.out.println(ability);
    }

    public String printInfo() {
        return super.getShop().getShopName() + " " + super.getType() + " "
                + model + " " + super.getAbility();
    }
}
