public class switchnumber {
    public static void main(String[] args) {
        printNumber(0);
    }
    public static void printNumber(int number){
        String thenumber = switch(number){
            case 0->"zero";
            case 1->"one";
            case 2->"two";
            case 3->"three";
            case 4->"four";
            case 5->"five";
            case 6->"six";
            case 7->"seven";
            case 8->"eight";
            case 9->"nine";
            default->"invalid number entered";
        };
        System.out.println(number + " represents the " + thenumber);
    }
}
