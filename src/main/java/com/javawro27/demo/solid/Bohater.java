package com.javawro27.demo.solid;

// O/C - Open Close
// Gra MMORPG
//     - postać walcząca mieczem
//     - postać walcząca łukiem
//     - postać walcząca owcą (wypchaną prochem)
//     - postać uciekająca

import com.javawro27.demo.solid.strategie.IStrategiaWalki;

public class Bohater {
    private String imie;
    private IStrategiaWalki strategiaWalki;

    public Bohater(String imie) {
        this.imie = imie;
    }

    public void setStrategiaWalki(IStrategiaWalki strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }

    public void walcz(){
//        do walki będzie używał swojej strategii
//        w zależności od przyjętej strategii, bohater zachowa się inaczej
        strategiaWalki.walcz();
    }
}
