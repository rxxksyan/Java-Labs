package org.example;

public class Swimmer implements Athlete, TeamPlayer {
    private String name;
    private String team;
    private int records;

    public Swimmer(String name, String team, int records) {
        this.name = name;
        this.team = team;
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    @Override
    public void train() {
        System.out.println(name + " плавает в бассейне");
    }

    @Override
    public void compete() {
        System.out.println(name + " плывет на соревнованиях");
    }

    @Override
    public String getResults() {
        return "Установлено рекордов: " + records;
    }

    @Override
    public void playWithTeam() {
        System.out.println(name + " выступает за команду " + team);
    }

    @Override
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}