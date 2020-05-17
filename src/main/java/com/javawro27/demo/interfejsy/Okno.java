package com.javawro27.demo.interfejsy;

import com.sun.xml.internal.bind.v2.model.core.ID;

// ponieważ możemy implementować wiele interfejsów
//  to musimy sprecyzować po którym interfejsie odziedziczymy metodę default
public class Okno implements Zamykalny, IDrzwi{

    // co jeśli chciałbym użyć którejść metody odziedziczonej
    @Override
    public void zamknij() {
//        Zamykalny.super.zamknij(); // Zamykam
        IDrzwi.super.zamknij(); // Cos innego
    }
}
