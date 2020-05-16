package com.javawro27.demo.paradygmaty;

import java.util.ArrayList;
import java.util.List;

public class PolimorfizmMain {
    public static void main(String[] args) {
        Ptak p = new Kukułka();
        // nie może wypisać się ćwir ćwir, ponieważ
        // posiadam instancję "konkretnego" obiektu Ptak - Kukułka
        //
        // wywoła się taka metoda, której referencję obiektu posiadamy
        p.spiewaj(); // ku ku


        // Liskov Substitution - powinniśmy po lewej stronie równania/przypisania
        // używać możliwie najwyższej klasy/interfejsu nadrzędnego który
        // dalej pozwoli nam realizować naszą funkcjonalność.
        List<Integer> list = new ArrayList<Integer>();
//      ...

    }

    public static void metodaPrzeiteruj(){

    }
}
