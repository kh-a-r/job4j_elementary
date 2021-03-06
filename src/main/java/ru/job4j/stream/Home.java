package ru.job4j.stream;

public class Home {
    private String city;
    private String street;
    private int number;
    private int apartment;

    @Override
    public String toString() {
        return "Home{"
                + "city='" + city + '\''
                + ", street='" + street + '\''
                + ", number=" + number
                + ", apartment=" + apartment
                + '}';
    }

     static class Builder {
        private String city;
        private String street;
        private int number;
        private int apartment;

         Builder buildCity(String city) {
            this.city = city;
            return this;
        }

         Builder buildStreet(String street) {
            this.street = street;
            return this;
        }

         Builder buildNumber(int number) {
            this.number = number;
            return this;
        }

         Builder buildApartment(int apartment) {
            this.apartment = apartment;
            return this;
        }

        Home build() {
            Home home = new Home();
            home.city = city;
            home.street = street;
            home.number = number;
            home.apartment = apartment;
        return home;
        }
    }

    public static void main(String[] args) {
            Home home = new Builder().buildCity("Ufa")
                    .buildStreet("Lenina")
                    .buildNumber(1)
                    .buildApartment(168)
                    .build();
            System.out.println(home);
        }
    }

