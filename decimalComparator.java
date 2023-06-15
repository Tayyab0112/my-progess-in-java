public class decimalComparator {
    public static void main(String[] args) {
        decimalCompar(5.2512, 5.2513);
    }
    public static void decimalCompar (double arg1, double arg2){
        if(arg1/10 ==arg2/10){
            System.out.println("equal ");
        }
        else if(arg1/100 == arg2/100){
            System.out.println("equal");
        }
        else if(arg1/1000 == arg2/1000){
            System.out.println("equal");
        }
        else if(arg1/10000 == arg2 /10000){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}

