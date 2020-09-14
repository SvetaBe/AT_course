package org.example;

public class Dog extends Animal {

    public Dog(String name, int age, double price){
        super(name, age, price);
    }

    public void voice() {
        System.out.println("Wuf wuf!");
    }

    public void voice(byte dogFood) {
        if (dogFood < 2) {
            voice();
        } else {
            System.out.println("............");
        }
    }
}
