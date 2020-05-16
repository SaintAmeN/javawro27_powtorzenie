package com.javawro27.demo.kolekcje;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        TreeSet - posortowany
//        Set - worek wartości - nie posiadamy żadnej pewności kolejności elementów

//        Słowa kluczowe
//              -- Linked: (jeśli wstawiane gdziekolwiek, to oznacza zachowanie kolejności wstawiania elementów)
//                - HashSet (LinkedHashSet)
//                - List    (LinkedList)
//                - HashMap (LinkedHashMap)
//              -- Tree     (jeśli użyte w nazwzie oznacza, że elementy są posortowane z pewnym kryterium)
//                - Set
//                - Map
//

//        Integer - posortuje wartością
//        Student (imie, indeks) - potrzebuje Comparatora żeby wskazać sposób sortowania

//        HashSet? ? Obiekt ?
//        - hashCode - jako metoda zwraca wartość liczbową
//        - equals   -
        Set<Para> setPar = new HashSet<>();
        setPar.add(new Para(1, 2));
        setPar.add(new Para(2, 1));
        setPar.add(new Para(1, 1));
        setPar.add(new Para(2, 2));

        // duplikat na podstawie wartości pól, ale nie adresów w pamięci.
        setPar.add(new Para(2, 1));

        System.out.println("Ilość rekordów: "  + setPar.size());

        Map<Integer, Student> mapOfStudents; // numerowanie od 0
        // 0, 1, 2, 3, 4, 100
        //       X
        // 0, 1,    3, 4, 100
        List<Student> listOfStudents;
        // 0, 1, 2, 3, 4
        //       x
        // 0, 1, 2, 3

        // lista - mniej pamięci, więcej czasu
        // mapa - więcej pamięci, mniej czasu
    }
}
