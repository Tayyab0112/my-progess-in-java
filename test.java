public class test {
    public static void main(String[] args) {
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("you got the highscore !");
        }

        int secondTopscore = 60;
        if (secondTopscore < topScore && topScore <= 100) {
            System.out.println("Greater than second topscore but less than 100");
        }

    }
}