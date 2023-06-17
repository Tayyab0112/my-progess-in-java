public class Switch  {
        public static void main(String[] args){
        // int value = 1;
        // if(value ==1){
        //     System.out.println("value was 1");
        // }
        // else if(value ==2){
        //     System.out.println("value was 2");
        // }
        // else {
        //     System.out.println("value was 3");
        // }
        int switchValue = 1;
        switch (switchValue){
            case 1:
            System.out.println("the value was 1");
            break;
            case 2:
            System.out.println("the value was 2");
            break;
            default:
            System.out.println("the value was neither 1 or 2");
        }
        }
}