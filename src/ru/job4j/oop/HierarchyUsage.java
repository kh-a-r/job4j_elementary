package ru.job4j.oop;

import ru.job4j.pojo.Obj;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport tr = car;
        Object obj = car;

        Object ocar = new Car();
        Car carFromObject = (Car) ocar;


        Object bicycle = new Bicycle();
        Car bc = (Car) bicycle;
    }

}
