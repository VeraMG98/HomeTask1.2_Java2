package com.company;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("Audi shop", "Bishkek");
        Shop shop1 = new Shop("Trains", "Novopokrovka");
        Audi audi = new Audi("Auto",shop, "2020",false);
        audi.printAbilityForType();
        System.out.println(audi.printInfo());

        Audi audi1 = new Audi("Auto Suv", shop, "2015", true);
        audi.printAbilityForType(Ability.DRIVE);
        System.out.println(audi1.printInfo());

        Car train = new Car("Train", shop1);
        train.printAbilityForType();
        System.out.println(train.printInfo());

        audi.copy(audi1);
        System.out.println(audi.printInfo());
    }
}
