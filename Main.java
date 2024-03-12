import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // superclass is the parent and is typically more generic
        // subclass extends a superclass and adds more specific
        // functionality

        // "is a"
        // "is a" relationship is a one way street
        // Quarterback is a Player

        // Polymorphism

        // Subclasses can be stored superclass variables
        // Quarterback can be stored in a Player variable


        Player p1 = new Quarterback("Justin Fields", 1);
        Player p2 = new Player("DJ Moore", "wide reciever", 2);

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);

        for (int i = 0; i < 10; i++) {
            players.add(new Player("jimbo", "basic", i+10));
        }
        

        for (int i = 0; i < 4; i++ ){
            System.out.println("\nGame #" + (i+1));

            for (Player player: players) {
                player.train();
                player.playGame();
            }
            if (i == 1) {
                players.add(new Quarterback("jimmy", 99));
            }
        }
        System.out.println("\n" + p1.getName() + " throw count:");

        // getThrowCount only exists in Quarterback.java
        // When compiling Java checks the delcared type to make sure
        // method is valid

        // Java doesn't see a getThrowCount in Player.java
        // errors out

        // Two solutions to this:
        // 1. Add getThrowCount to Player.java
        // 2. Cast to subclass
        System.out.println(( (Quarterback) p1 ).getThrowCount());
    }
}