public class Quarterback extends Player{
    //        subclass         superclass

    private int totalPasses;

    public Quarterback(String name, int number) {
        // Like we're calling `new Player(name, number)`
        super(name, number);
        totalPasses = 0;
    }

    // this comment doesn't need a semicolon
    @Override
    public void playGame() {
        int randomThrows = (int) (Math.random()*21) + 20; // randomly generate number between 20 and 40
        totalPasses += randomThrows;
        System.out.println(getName() + " threw " + randomThrows + " passes this game.");
        // This will call superclass's playGame instead of the more specific one.
        super.playGame();
    }

    public int getTotalPasses() {
        return totalPasses;
    }

    @Override
    public String toString() {
        return getName() + " (Quarterback " + getNumber() + ")";
    }
}
