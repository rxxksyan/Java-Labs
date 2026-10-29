package org.example;

public class App {
    public static void main(String[] args) {

        Athlete[] athletes = new Athlete[5];
        athletes[0] = new FootballPlayer("Месси", "Барселона", 30);
        athletes[1] = new FootballPlayer("Роналду", "Ювентус", 25);
        athletes[2] = new FootballPlayer("Неймар", "ПСЖ", 18);
        athletes[3] = new Swimmer("Фелпс", "США", 23);
        athletes[4] = new Swimmer("Чупков", "Россия", 5);

        for (int i = 0; i < athletes.length; i++) {
            System.out.println("Спортсмен " + (i + 1) + " ");
            athletes[i].train();
            athletes[i].compete();
            System.out.println(athletes[i].getResults());
            System.out.println();
        }

        System.out.println("Демонстрация TeamPlayer");

        TeamPlayer[] teamPlayers = new TeamPlayer[2];
        teamPlayers[0] = new FootballPlayer("Месси", "Барселона", 30);
        teamPlayers[1] = new Swimmer("Фелпс", "США", 23);

        for (int i = 0; i < teamPlayers.length; i++) {
            teamPlayers[i].playWithTeam();
            System.out.println("Команда: " + teamPlayers[i].getTeam());
        }
    }
}