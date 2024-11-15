import java.util.Scanner;

class A3_Area_of_Triangle{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double base;
        double height;
        double area;

        System.out.println("Please enter the base of the triangle");
        base = sc.nextDouble();
        System.out.println("Please enter the height of the triangle");
        height = sc.nextDouble();

        area = 0.5 * base * height;

        System.out.println("The area of th e triangle is: " + area);
    }
}