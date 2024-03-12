public class Player {
    // A player is their name and their number
    // A player can do the actions "playGame" and "train"
    
    // All objects organize things into what they are,
    // and what they can do
    
    private String name;
    private int number;
    
    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getNumber() {
        return this.number;
    }


    public void train() {
        System.out.println(this.name + " is training.");
    }

    public void playGame() {
        System.out.println(this.name + " is playing a game.");
    }
    
    // Override decorator
    @Override
    public String toString() {
        return this.name + " (" + this.number + ")";
    }
}