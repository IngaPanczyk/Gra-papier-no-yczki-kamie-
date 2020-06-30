import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RpsRunner {

    public static void main(String[] args) {
        GamesNumber gamesNumber = new GamesNumber(4);
        GiveWinner giveWinner = new GiveWinner();
        Player player = new Player();
        Computer computer = new Computer();
        giveWinner.giveWinner(player, computer,gamesNumber);
        System.out.println("!!!Gra zakończona!!!");
    }
}