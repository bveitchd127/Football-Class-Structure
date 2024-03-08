public class Player {
    private String name;
    private String position;
    private int jerseyNumber;
    
    public Player(String name, String myPosition, int jerseyNumber) {
        this.name = name;
        position = myPosition;
        this.jerseyNumber = jerseyNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }
    
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    
    public void playGame() {
        System.out.println(name + " the player, is playing a game.");
    }
    
    public void train() {
        System.out.println(name + " the player, is training.");
    }
    
    public String toString() {
        return name + " (" + jerseyNumber + ")";
    }
}