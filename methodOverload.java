public class methodOverload {
    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("new score is" + newScore);
        int newScore2 = calculateScore(200);
        System.out.println("2nd new score is "+ newScore2);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + "scored " + score + "points");
        return score*1000;
    }
    
    public static int calculateScore( int score){
        System.out.println("unamed player" + score + "points");
        return score*1000;
    }
}
