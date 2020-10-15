package com.company;

public class Car extends Transport {

    private Ability ability;
    private String model;

    public Car(String type, Ability ability) {
        super(type);
        this.ability = ability;
    }

    public Car(String type, String model, Ability ability){
        super(type);
        this.ability = ability;
        this.model = model;
    }

    public Ability getAbility() {
        return ability;
    }

    public String getModel() {
        return model;
    }

    public final void printAbilityForType(){
        System.out.println("DRIVE");
    }

    public String printInfo() {
        return super.getType() + " "
                + model + " " + ability;
    }
}
