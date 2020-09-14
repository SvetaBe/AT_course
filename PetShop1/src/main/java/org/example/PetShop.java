package org.example;

public class PetShop {
    private Animal dog = new Dog("Rex", 4, 599.99);
    private Animal cat = new Cat("Murzic", 2, 349.99);

    public PetShop() {
        System.out.println("Welcome to our 'PetShop'");
        System.out.println("We have one cat and one dog");
    }
    public Animal getAnimal(AnimalType type) {
        switch (type) {
            case CAT :
                return cat;
            case DOG :
                return dog;
            default:
                throw new RuntimeException("Unknown type of animal!");
        }
    }

    public void sellPet(Man man, Animal pet) {
        if (man.cash >= pet.price) {
            man.buyPet(pet);
            if (pet instanceof Cat) {
                this.cat = null;
            }
            else if (pet instanceof Dog) {
                this.dog = null;
            }
            else {
                System.out.println("Nevedoma zverushka!");
            }
        }
        else {
            System.out.println("Not enough money!");
        }

    }
}
