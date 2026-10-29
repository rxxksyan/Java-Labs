package org.example;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1 ");
        task1();
        System.out.println("\nЗАДАНИЕ 2");
        task2();
        System.out.println("\nЗАДАНИЕ 3");
        task3();
        System.out.println("\nЗАДАНИЕ 4");
        task4();
        System.out.println("\nЗАДАНИЕ 5");
        task5();
    }

    public static void task1() {
        String fileName = "season.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Мое любимое время года - Лето.\n");
            writer.write("Потому что есть каникулы\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Данные о файле:");
            System.out.println("Имя: " + file.getName());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Путь: " + file.getAbsolutePath());
        }

        System.out.println("\nИнформация из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        String fileName = "f2.txt";
        int count = 0;

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                try {
                    int num = in.nextInt();
                    writer.println(num);
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: вы ввели не целое число. Попробуйте еще раз.");
                    in.nextLine();
                    i--;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("Числа из файла, содержащие цифру 7:");
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                String numStr = String.valueOf(Math.abs(num));
                if (numStr.contains("7")) {
                    System.out.println(num);
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("Количество чисел с цифрой 7: " + count);
    }

    public static void task3() {
        String fName = "f3.txt";
        String gName = "g3.txt";
        String hName = "h3.txt";
        Random random = new Random();

        try (PrintWriter fWriter = new PrintWriter(new FileWriter(fName))) {
            for (int i = 0; i < 20; i++) {
                fWriter.println(random.nextInt(100) - 50);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try (Scanner fileScanner = new Scanner(new File(fName));
             PrintWriter gWriter = new PrintWriter(new FileWriter(gName));
             PrintWriter hWriter = new PrintWriter(new FileWriter(hName))) {

            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                if (num % 2 == 0 && num % 3 == 0) {
                    gWriter.println(num);
                } else {
                    hWriter.println(num);
                }
            }
            System.out.println("Файлы g3.txt и h3.txt успешно созданы.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void task4() {
        Scanner in = new Scanner(System.in);
        String fileName = "temp.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("Введите 12 вещественных значений температуры воды (каждое с новой строки):");
            for (int i = 0; i < 12; i++) {
                try {
                    String input = in.nextLine().trim();
                    input = input.replace(',', '.');
                    double temp = Double.parseDouble(input);
                    writer.println(temp);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: вы ввели не число. Попробуйте еще раз.");
                    i--;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    double temp = Double.parseDouble(line.trim());
                    sum += temp;
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        if (count > 0) {
            System.out.println("Средняя температура воды: " + (sum / count));
        } else {
            System.out.println("Файл пуст или данные не прочитаны.");
        }
    }

    public static void task5() {
        String fileName = "f5.txt";
        Random random = new Random();
        int count = 0;

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(100));
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("Числа из файла:");
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num > 25) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("\nКоличество чисел, больших 25: " + count);
    }
}