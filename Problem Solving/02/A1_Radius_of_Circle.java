import java.util.Scanner;

class A1_Radius_of_Circle{
    private static final double pi = 3.14;
    public static void main(String [] args){
        double radius;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        radius = sc.nextFloat();
        area = pi * radius * radius;
        System.out.println("Area of the circle is " + area);
    }
}