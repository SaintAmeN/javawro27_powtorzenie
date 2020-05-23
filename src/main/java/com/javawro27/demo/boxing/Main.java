package com.javawro27.demo.boxing;

public class Main {
    public static void main(String[] args) {
        int liczba = 23;

        // typ prymitywny!!!!
        wywolajMetode(liczba);

      //  |--------|
      //  |-- 23 --|
      //  |--------|
    }

                                    // typ złożony!!!
    public static void wywolajMetode(Object wartosc){
        System.out.println("Wypisanie: " + wartosc);
    }
}
