
public class test2 {
    public static void main(String[] args) {
        int sec =  3945;
        int minutes =  sec/60;
        System.out.println(minutes);
        
        int remainingsec = sec % 60;
        int remainingmin = minutes % 60;
        System.out.println(remainingsec);
        System.out.println(remainingmin);
    }
}
