import java.util.Scanner;

public class Player {
    int playerMove;

    public Player() {
        this.playerMove = playerMove;
    }

    public int getPlayerMove() {

        System.out.println("klawisz 1 - zagranie kamień, klawisz 2 - zagranie papier, klawisz 3 - zagranie nożyce, klawisz 4 - wyjście z gry, 5 - nowa gra");
        Scanner scan = new Scanner(System.in);
        int playerMove = scan.nextInt();
        if (playerMove > 4) {
            System.out.println("Wprowadziłaes blędną liczbę, gra zakończona");
        }
        if (playerMove == 4){
            System.out.println("Zrezygnowałeś z dalszej gry, gra zakończona");
        }else {
            if (playerMove == 1) {
                System.out.println("Zagrałeś kamień");
            } else {
                if (playerMove == 2) {
                    System.out.println("Zagrałeś  papier");
                } else {
                    System.out.println("Zagrałeś nożyczki");
                }
            }
        }
        return playerMove;
    }
}
