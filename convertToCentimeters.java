public class convertToCentimeters {
    public static void main(String[] args) {
        double n1 = toCentimeters(5);
        System.out.println(n1);
        double n2 = toCentimeters(5, 8);
        System.out.println("5 foot 8 inches in centimeters is" + n2);
    }
    public static double toCentimeters(int inches){
        
        return inches*2.54;
    }

    public static double toCentimeters(int foot,int inches){
        int foottoinches = (foot*12);
        int totalinches = (foottoinches + inches);
        double result = toCentimeters( totalinches);
        return result;
    // }
}
}
