import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Quarterback player1 = new Quarterback("Justin Fields", 1);
        Player player2 = new Player("DJ Moore", 2);


        System.out.println(player1);
        player1.train();
        player1.playGame();
        System.out.println(player1.getTotalPasses());

        System.out.println(player2);
        player2.train();
        player2.playGame();
        // System.out.println(player2.getTotalPasses());

    }
}