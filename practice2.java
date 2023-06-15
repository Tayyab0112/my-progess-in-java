public class practice2 {
    public static void main(String[] args) {
        printMegaBytesandKiloBytes(4096);
    }
    public static void printMegaBytesandKiloBytes(int kilobytes){
        int megaBytes = (kilobytes/1024);
        int remKilo = (kilobytes%1024);
        System.out.println(kilobytes + " KB = "+  megaBytes + " MB and " + remKilo +" KB");
    }
}
