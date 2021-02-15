package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int countOf = 11;
        while (countOf > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3) {
            // if (matches == 1 || matches == 2 || matches == 3) {
                turn = !turn;
                countOf = countOf - matches;
                System.out.println("Осталось спичек: " + countOf);
            } else {
                System.out.println(player + ", Вы ввели неверное число.");
            }

        }

            if (!turn) {
                System.out.println("Выиграл первый игрок");
            } else {
                System.out.println("Выиграл второй игрок");
            }
        }
    }


