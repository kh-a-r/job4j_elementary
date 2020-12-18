package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < pref.length; i++) {
                if (word[i] == pref[i]) {
                   count++;
                }
        }
        if (count == pref.length) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean rslt = ArrayChar.startsWith(word, pref);
        System.out.println(rslt);
    }
}
