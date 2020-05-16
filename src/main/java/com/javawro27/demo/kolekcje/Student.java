package com.javawro27.demo.kolekcje;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private int indeks;
    private String imie;
    private String nazwisko;

    public Student(int indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return indeks == student.indeks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(indeks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "indeks=" + indeks +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    //...
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(123, "Pawel", "Gawel"));
        set.add(new Student(124, "Pawel", "Gawel"));

        set.add(new Student(123, "Pawel", "Gawel"));

        System.out.println(set);
    }
}
