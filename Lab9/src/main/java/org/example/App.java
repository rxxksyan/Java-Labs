package org.example;

import test.Smartphone;

public class App {
    public static void main(String[] args) {

        Artist[] artists = new Artist[5];
        artists[0] = new Singer("Иванов", 35, "поп", "тенор");
        artists[1] = new Singer("Петрова", 28, "рок", "сопрано");
        artists[2] = new Singer("Сидоров", 42, "джаз", "баритон");
        artists[3] = new Dancer("Кузнецова", 24, "балет", "классический");
        artists[4] = new Dancer("Смирнов", 30, "хип-хоп", "брейк-данс");

        Smartphone phone1 = new Smartphone("iPhone 18");
        phone1.showModel();
        phone1.call();
        phone1.charge(78);

        for (int i = 0; i < artists.length; i++) {
            System.out.println("Артист " + (i + 1) + " ");
            artists[i].displayInfo();
            artists[i].perform();
            System.out.println(artists[i].getAwards());
            System.out.println();


        }
    }
}