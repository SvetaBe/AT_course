package org.example;

public class Cat extends Animal{
    
    public Cat(String name, int age, double price){
        super(name, age, price);
    }

    public void voice() {
        System.out.println("Myaaaaaaaaaauuuuuu");
    }

    public void voice(byte catFood) {
        if (catFood < 2) {
            voice();
        } else {
            System.out.println("............");
        }
    }
}
