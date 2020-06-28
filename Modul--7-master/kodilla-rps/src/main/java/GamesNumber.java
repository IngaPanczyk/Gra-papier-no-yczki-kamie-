import java.util.Scanner;

public class GamesNumber {
    int numberOfGames;

    public GamesNumber(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public int getNumberOfGames() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do ilu zwycięstw chcesz grać?");
        int numberOfGames = scan.nextInt();
        System.out.println("Grasz do "+ numberOfGames +" zwycięstw");
        return numberOfGames;
    }
}
