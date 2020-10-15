package com.company;

public class Main {

    public static void main(String[] args) {
        Audi audi = new Audi("Auto", "2020",false, Ability.DRIVE);
        audi.printAbilityForType();
        System.out.println(audi.printInfo());

        Audi audi1 = new Audi("Auto Suv", "2015", true, Ability.DRIVE);
        audi.printAbilityForType();
        System.out.println(audi1.printInfo());

        Car train = new Car("Train", Ability.DRIVE);
        train.printAbilityForType();
        System.out.println(train.printInfo());


    }
}
