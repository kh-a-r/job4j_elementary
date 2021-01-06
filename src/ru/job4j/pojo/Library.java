package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 234);
        Book book2 = new Book("Винни Пух", 34);
        Book book3 = new Book("Ну, погоди", 334);
        Book book4 = new Book("Война и мир", 134);
        Book[] libr = new Book[]{book1, book2, book3, book4};
        for (int i = 0; i < libr.length; i++) {
            System.out.println(libr[i].getName());
        }
        System.out.println();

        Book temp = libr[0];
        libr[0] = libr[3];
        libr[3] = temp;
        for (int i = 0; i < libr.length; i++) {
            if (libr[i].getName().equals("Clean code")) {
                System.out.println(libr[i].getName());

            }
        }
    }
}
