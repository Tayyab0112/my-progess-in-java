public class practice3 {
    public static void main(String[] args) {
        shouldWakeUp(true, 22);
    }
    public static void shouldWakeUp(boolean barking, int hourOfDay){
        if(barking == true){
        if(hourOfDay<=24&& hourOfDay >=22){
            barking = true;
            System.out.println("Alert! the dog is barking");
        }
        else if(hourOfDay<8 && hourOfDay>0){
            barking = true;
        System.out.println("Alert ! the dog is barking");
        }
        else{
            System.out.println("not to worry dog is not barking or maybe its daytime");
        }
    }
    else{
        System.out.println("the dog is not barking");
    }
    }
}
