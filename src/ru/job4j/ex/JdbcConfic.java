package ru.job4j.ex;

public class JdbcConfic {
    public static void load(String url) throws UserInputEx {
        if (url == null) {
            throw new UserInputEx("Url could not be null");
        }
    }

    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputEx e) {
            e.printStackTrace();
        }
    }
}
