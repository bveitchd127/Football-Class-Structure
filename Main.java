public class Main {
    public static void main(String[] args) {

        Quarterback p1 = new Quarterback("Justin Fields", 1);
        Player p2 = new Player("DJ Moore", "wide reciever", 2);
        
        for (int i = 0; i < 4; i++ ){
            System.out.println("\nGame #" + (i+1));
            p1.train();
            p2.train();
            
            p1.playGame();
            p2.playGame();
        }
        System.out.println("\n" + p1.getName() + " throw count:");
        System.out.println(p1.getThrowCount());
    }
}