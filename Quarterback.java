public class Quarterback extends Player {
    //                   ******new*****
    //        subclass         superclass
    private int throwCount;
    
    public Quarterback(String name, int jerseyNumber) {
        // first line must be superclass's constructor
        super(name, "quarterback", jerseyNumber);
        
        throwCount = 0;
    }
    
    public void train() {
        System.out.println(getName() + " the quarterback, is training.");
    }
    
    public int getThrowCount() {
        return throwCount;
    }
    
    public void playGame() {
        int throwsThisGame = (int) (Math.random()*20);
        throwCount += throwsThisGame;
        System.out.println(getName() + " threw " + throwsThisGame + " balls this game.");
    }
    
}