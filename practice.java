
public class practice {
    public static void main(String[] args) {
        double ans = tomilesPerHour(15);
        long i = (int)ans;
        System.out.println(i);
    }
    public static long tomilesPerHour(double kilometersPerHour){
        if(kilometersPerHour>0){
            kilometersPerHour = (kilometersPerHour*0.6213712);
            long i = (long)kilometersPerHour;
            
            return ((i));
        }
        else{
        return -1;
        }
    }
}
