package org.example;

public class Main {
    public static void main(String[] args){
        PetShop shop = new PetShop();
        Man man = new Man("john Connor", 42, 400.00);

        Animal cat = shop.getAnimal(AnimalType.CAT);
        Animal dog = shop.getAnimal(AnimalType.DOG);

        System.out.println(cat);
        System.out.println(dog);

        shop.sellPet(man, dog);
        shop.sellPet(man, cat);

        cat = shop.getAnimal(AnimalType.CAT);
        dog = shop.getAnimal(AnimalType.DOG);

        System.out.println(cat);
        System.out.println(dog);
    }
}
