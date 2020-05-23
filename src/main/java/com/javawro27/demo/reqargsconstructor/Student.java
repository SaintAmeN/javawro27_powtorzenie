package com.javawro27.demo.reqargsconstructor;

public class Student {
    // pole finalne = stała
    // stała musi mieć wartość

    private final String firstName;
    private String lastName;

    // nie istnieje możliwość użycia konstruktora domyślnego. ZAWSZE MUSIMY PRZYPISAC CHOCIAZ firstName
    public Student(String firstName) {
        this.firstName = firstName;
    }
}
