public class switchChallenge2 {
    public static void main(String[] args) {
        printDayofWeek(0);
    }
    public static void printDayofWeek(int day){
        String dayofweek = switch(day){
            case 0-> "sunday";
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> "invalid day";
        };
        System.out.println(day +" stands for" + dayofweek);
    }
}
