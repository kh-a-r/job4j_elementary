package ru.job4j.pojo;

import java.util.Objects;

public class Obj {
  private String name;

    public Obj(String name) {
    this.name = name;
}

    /*@Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(name, obj.name);
    }*/

   /* @Override
    public int hashCode() {
        return Objects.hash(name);
    }*/

    public static void main(String[] args) {
        Obj first = new Obj("qwe");
        Obj second = new Obj("qwe");
        boolean eq = first.equals(second);
        System.out.println(eq);
    }

}
