/*
import java.util.Scanner;

public class GiveWinner {

    public String giveWinner(Player player, Computer computer, GamesNumber gamesNumber) {
        // boolean end = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String firstName = scan.nextLine();
        System.out.println("Witaj " + firstName);

        int numberOfwin = 0;
        int numberOfGames = gamesNumber.getNumberOfGames();
        int gamesCounter = 0;

        while (numberOfwin != numberOfGames) {

            int rock = 1;
            int paper = 2;
            int sizors = 3;
            int computerMove = computer.getRandomComputerMove();
            int playerMove = player.getPlayerMove();

            //Remis
            if (playerMove == computerMove) {
                gamesCounter = gamesCounter + 1;
                System.out.println("Remis, komputer zagrał to samo");
                System.out.println("Zagradno już "+ gamesCounter +" rund, grasz do " + numberOfGames + " zwycięstw!" );
            } else {
                //Jeden
                if (playerMove == 1) {
                    if (computerMove == 2) {
                        gamesCounter = gamesCounter + 1;
                        System.out.println("Przegrałeś, komputer zagrał papier");
                        System.out.println("Zagradno już "+ gamesCounter +" rund, grasz do " + numberOfGames + " zwycięstw!" );
                    } else {
                        gamesCounter = gamesCounter + 1;
                        System.out.println("Wygrałeś, komputer zagrał nożyczki");
                        numberOfwin = numberOfwin + 1;
                        System.out.println("Zagradno już "+ gamesCounter +" rund, grasz do " + numberOfGames + " zwycięstw!" );
                    }
                }
                if (playerMove == 2) {
                    if (computerMove == 3) {
                        gamesCounter = gamesCounter + 1;
                        System.out.println("Przegrałeś, komputer zagrał nożyczki");
                        System.out.println("Zagradno już "+ gamesCounter +" rund, grasz do " + numberOfGames + " zwycięstw!" );
                    } else {
                        gamesCounter = gamesCounter + 1;
                        System.out.println("Wygrałeś, komputer zagrał kamień");
                        numberOfwin = numberOfwin + 1;
                        System.out.println("Zagradno już "+ gamesCounter +" rund, grasz do " + numberOfGames + " zwycięstw!" );
                    }
                }
                if (playerMove == 3) {
                    if (computerMove == 1) {
                        gamesCounter = gamesCounter + 1;
                        System.out.println("Przegrałeś, komputer zagrał kamień");
                        System.out.println("Zagradno już "+ gamesCounter +" rund, grasz do " + numberOfGames + " zwycięstw!" );
                    } else {
                        gamesCounter = gamesCounter + 1;
                        System.out.println("Wygrałeś, komputer zagrał papier");
                        numberOfwin = numberOfwin + 1;
                        System.out.println("Zagradno już "+ gamesCounter +" rund, grasz do " + numberOfGames + " zwycięstw!" );
                    }
                }

            }

        }
        return "Tura zakończona";
    }
}*/
