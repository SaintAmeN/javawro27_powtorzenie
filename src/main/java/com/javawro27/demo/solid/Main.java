package com.javawro27.demo.solid;

import com.javawro27.demo.solid.strategie.StrategiaWalkiMieczem;
import com.javawro27.demo.solid.strategie.StrategiaWalkiOwcąZProchem;
import com.javawro27.demo.solid.strategie.StrategiaWalkiŁukiem;

public class Main {
    public static void main(String[] args) {
        // 5
        // Kod który nie wymaga dużego nakładu pracy na rozwijanie nowych funkcjonalności i utrzymanie
        // 1 S - Single Responsibility - Pojedyncza odpowiedzialnosc
//                      - metoda powinna odppwiadać za jedną funkcjonalność
//                      - klasa powinna realizować jedną funkcjonalność
//                      - powinien istnieć co najwyżej jeden powód do modyfikowania klasy
        // 2 O - Open/Close - Otwarty na rozszerzenie, zamknięty na zmiany
//                      - jest powiązany wzorzec projektowy - strategia (jak działa?)
        Bohater bohater = new Bohater("Marian");
        bohater.setStrategiaWalki(new StrategiaWalkiMieczem());
        bohater.walcz();

        bohater.setStrategiaWalki(new StrategiaWalkiŁukiem());
        bohater.walcz();

        bohater.setStrategiaWalki(new StrategiaWalkiOwcąZProchem());
        bohater.walcz();

        // 3 L - Liskov Substitiution - plimorfizm - po lewej stronie równania przypisujemy dowolny typ nadrzędny
//                          - który pozwli realizować naszą funkcjonalność:
                            // stosować List<Integer> list = new ArrayList<>();
//                          // zamiast:
                            // stosować ArrayList<Integer> list = new ArrayList<>();

        // 4 I - Intreface segregation - wiele prostych interfejsów zamiast mniejszej ilości skomplikowanych
                            // piszmy interfejsy z jak najmniejszą ilością metod


    }
}
