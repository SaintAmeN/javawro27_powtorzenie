package com.javawro27.demo.kolekcje;

import java.util.Objects;

public class Para {
    private int lewa;
    private int prawa;

    public Para(int lewa, int prawa) {
        this.lewa = lewa;
        this.prawa = prawa;
    }

    // metoda equals porównuje referencje chyba, że ją nadpiszemy
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Para para = (Para) o;
        return lewa == para.lewa &&
                prawa == para.prawa;
    }

    // jeśli nie nadpiszę tej metody, to hashCode wylicza się na podstawie adresu w pamięci/referencji
    // oblicz hash Code na podstawie dwóch pól
    @Override
    public int hashCode() {
        return Objects.hash(lewa, prawa);
    }

    @Override
    public String toString() {
        return "Para{" +
                "lewa=" + lewa +
                ", prawa=" + prawa +
                '}';
    }

// jeśli metoda equals zwraca true (obiekty są takie same)
    // to metoda hashCode musi również dawać ten sam wynik obliczeń (
}
