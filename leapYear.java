public class leapYear{
    public static void main(String[] args) {
        calLeapYear(2000);
        
    }
    public static void calLeapYear(int year){
        if(year%400 ==0){
            System.out.println("yes! a leap year");
        }
        else if(year%100 == 0){
            System.out.println("No ! not a leap year");
        }
        else if(year % 4 == 0){
            System.out.println("yes! a leap year");
        }
        else{
            System.out.println("not a leap year");
        }

    }
}