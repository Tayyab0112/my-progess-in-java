public class minutes{
    public static void main(String[] args) {
        
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 45));// this is the second test case
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        // two step approach
        if(seconds<0){
            return "invalid data for seconds (" + seconds +
            "),must be a positive integer value";
        }

        // int minutes = seconds/60;
        return getDurationString(seconds / 60, seconds % 60);
    }

    
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "invalid data for minutes (" + minutes +
                    "),must be a positive integer value";
        }

        if(seconds<=0 || seconds>=59){
            return "invalid data for seconds (+ "+ seconds +
            " must be between zero and fifty nine)"; 
        // two step approach}
        }
        int hours = minutes / 60;
        // System.out.println("hours = "+hours);

        // remaining minutes
        int remainingminutes = minutes % 60;
        int remainingseconds = seconds % 60;

        return hours + "hr" + remainingminutes + "m" + remainingseconds + "s";
    }    
    
}