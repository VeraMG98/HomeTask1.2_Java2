package com.company;

public class Transport {
    private Ability ability;
    private String type;
    private Shop shop;

    public Transport() {
    }

    public Transport(String type, Shop shop, Ability ability) {
        this.type = type;
        this.shop = shop;
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }

    public String getType() {
        return type;
    }

    public Shop getShop() {
        return shop;
    }

    public String printInfo() {
        return getType() + " " + getShop().getShopName() + " " + getShop().getShopAddress();
    }

    public void printAbilityForType(){

    }
}
