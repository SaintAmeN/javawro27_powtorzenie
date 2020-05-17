package com.javawro27.demo.interfejsy;

public interface Zamykalny {
    default void zamknij(){
        System.out.println("Zamykam");
    }
}
