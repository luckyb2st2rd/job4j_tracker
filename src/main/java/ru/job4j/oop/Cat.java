package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        String voice = "may - may";
        return voice;
    }

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says: " + say);
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.eat("cutlet");
        gav.show();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.show();
        System.out.println("There is sparky`s food.");
        sparky.eat("sosij");
        sparky.show();
    }
}
