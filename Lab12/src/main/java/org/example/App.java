package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        System.out.println("ЗАДАНИЕ 1");
        Map<String, FoodItem> foodMap = new HashMap<>();
        foodMap.put("Маргарита", new Pizza("Маргарита", 1, 800, "Сыр, томаты"));
        foodMap.put("Пепперони", new Pizza("Пепперони", 2, 1000, "Пепперони, сыр"));
        foodMap.put("Четыре сыра", new Pizza("Четыре сыра", 3, 1100, "Моцарелла, пармезан"));
        foodMap.put("Цезарь", new Salad("Цезарь", 4, 300, "Майонез"));
        foodMap.put("Греческий", new Salad("Греческий", 5, 250, "Оливковое масло"));
        foodMap.put("Витаминный", new Salad("Витаминный", 6, 150, "Сметана"));
        foodMap.put("Тирамису", new Dessert("Тирамису", 7, 450, 30));
        foodMap.put("Чизкейк", new Dessert("Чизкейк", 8, 500, 40));

        for (Map.Entry<String, FoodItem> entry : foodMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " | Значение: " + entry.getValue());
        }



        System.out.println("\nЗАДАНИЕ 2");
        List<Park> parks = new ArrayList<>();
        parks.add(new Park(1, "Центральный", "Минск", 3, Arrays.asList(2, 3, 2, 1)));
        parks.add(new Park(2, "Парк Горького", "Минск", 5, Arrays.asList(5, 4, 5, 5, 4)));
        parks.add(new Park(3, "Малиновский парк", "Минск", 4, Arrays.asList(4, 4, 5, 3)));
        parks.add(new Park(4, "Заброшенный", "Гомель", 1, Arrays.asList(1, 2, 1)));
        parks.add(new Park(5, "Ботанический", "Киев", 5, Arrays.asList(5, 5, 4, 5)));
        parks.add(new Park(5, "отанический", "Киев", 5, Arrays.asList(5, 5, 4, 5)));

        System.out.println("Исходный список парков:");
        for (Park p : parks) System.out.println(p);

        Iterator<Park> iterator = parks.iterator();
        while (iterator.hasNext()) {
            Park p = iterator.next();
            if (p.getAverageRating() < 3.0) {
                iterator.remove();
            }
        }

        for (Park p : parks) {
            if (p.getAverageRating() >= 4.0) {
                p.setRating(p.getRating() + 1);
            }
        }

        System.out.println("\nПосле удаления и повышения рейтинга:");
        for (Park p : parks) System.out.println(p);

        parks.sort(new Comparator<Park>() {
            @Override
            public int compare(Park p1, Park p2) {
                int cmp = Double.compare(p1.getAverageRating(), p2.getAverageRating());
                if (cmp == 0) {
                    return p1.getName().compareTo(p2.getName());
                }
                return cmp;
            }
        });

        System.out.println("\nОтсортированный список:");
        for (Park p : parks) System.out.println(p);

    }

    public static void printParks(List<Park> parks, int rating) {
        for (Park p : parks) {
            if (p.getRating() == rating) {
                System.out.println(p);
            }
        }
    }
}