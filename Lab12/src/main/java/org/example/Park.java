package org.example;

import java.util.List;

public class Park {
    private int id;
    private String name;
    private String city;
    private int rating;
    private List<Integer> visitorRatings;

    public Park(int id, String name, String city, int rating, List<Integer> visitorRatings) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rating = rating;
        this.visitorRatings = visitorRatings;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public double getAverageRating() {
        if (visitorRatings == null || visitorRatings.isEmpty()) return 0;
        int sum = 0;
        for (int r : visitorRatings) sum += r;
        return (double) sum / visitorRatings.size();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Город: " + city +
                ", Рейтинг: " + rating + ", Средний балл: " + String.format("%.2f", getAverageRating());
    }
}