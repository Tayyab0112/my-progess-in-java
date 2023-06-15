public class Main  {
        public static void main(String[] args){
        int highscoreposition = calculatehighscore(1500);
        displayHighScore("tim", highscoreposition);
        }
        public static void displayHighScore(String name, int position){
            System.out.println(name + " is on the  position " + position + " on the highscore list");
        }
        public static int calculatehighscore(int score){
            if (score>=1000){
                return 1;
            }
            else if(1000>=score && score>=500){
                return 2;
            }
            else if (score>=100 && score<=500){
                return 3;
            }
            else {
                return 4;
            }
        }
}