package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 4);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] prods = new Product[3];
        prods[0] = bread;
        prods[1] = egg;
        prods[2] = milk;
        for (int i = 0; i < prods.length; i++) {
            //Product pr = prods[i];
            //System.out.println(prods[i].getName() + " - " + prods[i].getCount());
        }
        Product oil = new Product("Oil", 3);
        prods[2] = oil;
        for (int i = 0; i < prods.length; i++) {
            if (prods[i].getCount() > 10) {
                System.out.println(prods[i].getName() + " - " + prods[i].getCount());
            }
        }
    }
}
