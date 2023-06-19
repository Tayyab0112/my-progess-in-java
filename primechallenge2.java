public class primechallenge2 {
    public static void main(String[] args) {
        // System.out.println("0 is a "+ (isPrime(0)?" ":"NOT" + "a prime number "));
        int count = 0;
        for(int i = 10; i<50;i++){
            if(isPrime(i)){
                System.out.println("number" + i+ "is a prime number");
                count ++;
                if(count ==3){
                    System.out.println("found -3 exiting for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int WholeNumber){
        if(WholeNumber<=2){
            return (WholeNumber == 2);
        }
        for(int divisor = 2; divisor<WholeNumber; divisor++){
            if(WholeNumber%divisor == 0){
                return false;
            }
        }
        return true;    
    }
}
