package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static Phone findPhone(List<Phone> store, String model) throws PhoneNotFoundException {
        for (Phone p : store) {
            if (p.getModel().equalsIgnoreCase(model)) {
                return p;
            }
        }
        throw new PhoneNotFoundException("Телефон с моделью '" + model + "' не найден!", model);
    }

    public static void main(String[] args) {
        List<Phone> store = new ArrayList<>();

        System.out.println("1. Добавление телефонов ");
        try {
            store.add(new Phone("Samsung", "S23", 80000, 256, 5000));
            store.add(new Phone("Apple", "iPhone 14", 95000, 128, 3200));

            store.add(new Phone("Nokia", "3310", -100, 16, 1000));

        } catch (InvalidPhoneDataException e) {
            System.out.println("Ошибка при создании: " + e.getMessage());
        } finally {
            System.out.println("Блок finally. Телефонов в магазине: " + store.size() + "\n");
        }

        System.out.println("2. Проверка обновления цены");
        try {
            Phone myPhone = findPhone(store, "S23");
            System.out.println("До изменения: " + myPhone);

            myPhone.updatePrice(75000);
            System.out.println("После изменения: " + myPhone);

            myPhone.updatePrice(-5000);

        } catch (PhoneNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } catch (PriceUpdateException e) {
            System.out.println("Ошибка обновления: " + e.getMessage());
        }

        System.out.println("\n3. Поиск несуществующего телефона");
        try {
            Phone ghostPhone = findPhone(store, "Xiaomi");
        } catch (PhoneNotFoundException e) {
            System.out.println("Исключение: " + e.getMessage() + " (Модель: " + e.getModel() + ")");
        }

        System.out.println("\n4. Обновление памяти");
        try {
            Phone iphone = findPhone(store, "iPhone 14");
            System.out.println("До обновления: " + iphone);
            iphone.upgradeMemory(64);
        } catch (PhoneNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } catch (InvalidPhoneDataException e) {
            System.out.println("Ошибка памяти: " + e.getMessage());
        }
    }
}