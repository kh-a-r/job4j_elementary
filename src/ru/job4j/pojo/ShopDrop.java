package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
           Product temp = products[i];
            products[i] = products[i + 1];
            products[i + 1] = temp;
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Oil", 19);

        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i].getName() + " ");
        }

        System.out.println();
       products[1] = null;

       for (int i = 0; i < products.length; i++) {
           if (products[i] != null) {
               System.out.print(products[i].getName() + " ");
           } else {
               System.out.print("null" + " ");
           }
       }
        System.out.println();

        Product[] prod = leftShift(products, 1);
        for (int j = 0; j < prod.length; j++) {
                if (prod[j] != null) {
                    System.out.println(prod[j].getName());
                } else {
                    System.out.println("null");
                }
            }
        }
    }

