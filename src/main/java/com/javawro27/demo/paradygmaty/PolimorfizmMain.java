package com.javawro27.demo.paradygmaty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolimorfizmMain {
    public static void main(String[] args) {
        Ptak p = new Kukułka();
        // nie może wypisać się ćwir ćwir, ponieważ
        // posiadam instancję "konkretnego" obiektu Ptak - Kukułka
        //
        // wywoła się taka metoda, której referencję obiektu posiadamy
//        p.spiewaj(); // ku ku


        // Liskov Substitution - powinniśmy po lewej stronie równania/przypisania
        // używać możliwie najwyższej klasy/interfejsu nadrzędnego który
        // dalej pozwoli nam realizować naszą funkcjonalność.
        List<Integer> list = new LinkedList<>();
//      ...

        dodajElementyDoListy(list);
        // mam 100000

        metodaPrzeiterujIZmierzCzas(list);
    }

    private static void dodajElementyDoListy(List<Integer> argList) {
        for (int i = 0; i < 1000000; i++) {
            argList.add(i);
        }
    }

    public static void metodaPrzeiterujIZmierzCzas(List<Integer> argList){
        Long timeStart = System.currentTimeMillis();

        for (int i = 0; i < argList.size(); i++) { // (size()) - złożoność = n
            int wartosc = argList.get(i);          // (get(n)) - złożoność = n
        }

        Long timeStop = System.currentTimeMillis();

        System.out.println("Czas wykonania: " + (timeStop - timeStart));
    }
}
