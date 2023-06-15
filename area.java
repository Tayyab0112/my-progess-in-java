public class area {
    public static void main(String[] args) {
        System.out.println("the area of the circle is"+ calculateArea(12));
        System.out.println("the area of the rectangle is " +calculateArea(12, 10));
    }
    public static double calculateArea(double radius){
        double area = radius* radius * 3.14;
        return area;
    }
    
    public static double calculateArea(double length , double breadth) {
        double area = length * breadth;
        return area;
    }

}
