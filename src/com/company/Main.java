package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Shop shop = new Shop("Audi shop", "Bishkek");
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
        System.out.println(audi.printInfo());*/


        ArrayList<Person> persons =  new ArrayList<>();
        Person person;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Add person or show list?");
            String word = scanner.nextLine();
            if (word.equals("Add")) {
                System.out.println("Enter person's name, address and age");
                String name = scanner.nextLine();
                String address = scanner.nextLine();
                int age = scanner.nextInt();
                person = new Person(name, age, address);
                persons.add(person);
            } else if (word.equals("Show")) {
                for (Person person1:persons) {
                    System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getAddress());
                }
            }
        }
    }

    public static void printArr(ArrayList<Person> arrayList){
        Iterator<Person> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
