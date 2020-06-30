import java.util.Scanner;

public class GiveWinner {

    public void giveWinner(Player player, Computer computer, GamesNumber gamesNumber) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String firstName = scan.nextLine();
        System.out.println("Witaj " + firstName);

        int numberOfGames = gamesNumber.getNumberOfGames();
        int winsCounter1 = 0;
        int winsCounter2 = 0;
        int gamesCounter = 0;


        while (numberOfGames != winsCounter1 && numberOfGames != winsCounter2) {

            int playerMove = player.getPlayerMove();
            int computerMove = computer.getRandomComputerMove();
            if (playerMove == 4) {
                numberOfGames = winsCounter1;
                System.out.println("Zrezygnowałeś z gry");
            } else {
                //Remis
                if (playerMove == computerMove) {
                    gamesCounter = gamesCounter + 1;
                    System.out.println("Remis, komputer zagrał to samo");
                    System.out.println("Zagradno rund: " + gamesCounter + " , grasz do " + numberOfGames + " zwycięstw!" + " Komputer: " + winsCounter1 + " Gracz: " + winsCounter2);
                } else {
                    //Jeden
                    if (playerMove == 1) {
                        if (computerMove == 2) {
                            gamesCounter = gamesCounter + 1;
                            winsCounter1 = winsCounter1 + 1;
                            System.out.println("Przegrałeś, komputer zagrał papier");
                            System.out.println("Zagradno rund: " + gamesCounter + " , grasz do " + numberOfGames + " zwycięstw!" + " Komputer: " + winsCounter1 + " Gracz: " + winsCounter2);
                        } else {
                            gamesCounter = gamesCounter + 1;
                            winsCounter2 = winsCounter2 + 1;
                            System.out.println("Wygrałeś, komputer zagrał nożyczki");
                            System.out.println("Zagradno rund: " + gamesCounter + " , grasz do " + numberOfGames + " zwycięstw!" + " Komputer: " + winsCounter1 + " Gracz: " + winsCounter2);
                        }
                    }
                    if (playerMove == 2) {
                        if (computerMove == 3) {
                            gamesCounter = gamesCounter + 1;
                            winsCounter1 = winsCounter1 + 1;
                            System.out.println("Przegrałeś, komputer zagrał nożyczki");
                            System.out.println("Zagradno rund: " + gamesCounter + " , grasz do " + numberOfGames + " zwycięstw!" + " Komputer: " + winsCounter1 + " Gracz: " + winsCounter2);
                        } else {
                            gamesCounter = gamesCounter + 1;
                            winsCounter2 = winsCounter2 + 1;
                            System.out.println("Wygrałeś, komputer zagrał kamień");
                            System.out.println("Zagradno rund: " + gamesCounter + " , grasz do " + numberOfGames + " zwycięstw!" + " Komputer: " + winsCounter1 + " Gracz: " + winsCounter2);
                        }
                    }
                    if (playerMove == 3) {
                        if (computerMove == 1) {
                            winsCounter1 = winsCounter1 + 1;
                            gamesCounter = gamesCounter + 1;
                            System.out.println("Przegrałeś, komputer zagrał kamień");
                            System.out.println("Zagradno rund: " + gamesCounter + " , grasz do " + numberOfGames + " zwycięstw!" + " Komputer: " + winsCounter1 + " Gracz: " + winsCounter2);
                        } else {
                            gamesCounter = gamesCounter + 1;
                            winsCounter2 = winsCounter2 + 1;
                            System.out.println("Wygrałeś, komputer zagrał papier");
                            System.out.println("Zagradno rund: " + gamesCounter + " , grasz do " + numberOfGames + " zwycięstw!" + " Komputer: " + winsCounter1 + " Gracz: " + winsCounter2);
                        }
                    }

                }


            }
        }
    }

}
