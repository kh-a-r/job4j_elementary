package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl redHat = new Girl();
        Wolf wolf = new Wolf();
        redHat.help(petya);
       // wolf.eat(redHat);
        petya.kill(wolf);
    }
}
