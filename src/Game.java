public class Game {
    private int score;
    public Game(){
        score=0;
    }
    public void setScore(int sore) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public static void main (String []args){
        Game g1 = new Game();
        System.out.println(g1.getScore());
    }
}
