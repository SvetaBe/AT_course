package org.example;

public class Man {
    private final String name;
    private int age;
    private Animal pet;
    public   double cash;

    public Man(String name, int age, double cash){
        this.name = name;
        this.age = age;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public void buyPet(Animal pet) {
        this.pet = pet;
        this.cash = this.cash - pet.price;
        System.out.println(name + " buy " + pet.toString() + " and his cash is " + this.cash);
    }
}
