package ru.job4j.oop;

public class Tamagotchi {
    private int weight = 100;

    public void feed() {
        weight += 10;
    }

    public String info() {
        return "weight: " + weight;
    }

    public static void feedPet(Tamagotchi petCopy) {
        petCopy.feed();
    }

    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        System.out.println(pet.info());
        feedPet(pet);
        System.out.println(pet.info());
        /*Tamagotchi petCopy = pet;
        System.out.println(pet.info());
        System.out.println("copy of " + petCopy.info());
        petCopy.feed();
        System.out.println(pet.info());
        System.out.println("copy of " + petCopy.info());*/
        /*int weight = 100;
        int weightCopy = weight;
        System.out.println("weight: " + weight);
        System.out.println("weightCopy: " + weightCopy);
        weightCopy += 10;
        System.out.println("weight: " + weight);
        System.out.println("weightCopy: " + weightCopy);*/
    }
}
