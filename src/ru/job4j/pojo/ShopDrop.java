package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("Oil", 10);
        products[1] = new Product("Salt", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Oil", 19);

        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i].getName() + " ");
        }

        System.out.println();

        Product[] prod = leftShift(products, 0);
        for (int j = 0; j < prod.length; j++) {
                if (prod[j] != null) {
                    System.out.print(prod[j].getName() + " ");
                } else {
                    System.out.print("null");
                }
            }
        }
    }

