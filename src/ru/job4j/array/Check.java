package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        int count = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[0] && data[i] == data[0]) {
                result = true;
            }

        }
        return result;
    }

    public static void main(String[] args) {
       // boolean[] data = {true, false, true};
      //  boolean[] data = {true, true, true};
        boolean[] data = {false, false, false};
        boolean rsl = mono(data);
        System.out.println(rsl);
    }

}
