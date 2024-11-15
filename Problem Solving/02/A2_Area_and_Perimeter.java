import java.util.Scanner;

class A2_Area_and_Perimeter{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");
        double length = sc.nextDouble();

        System.out.println("Enter the width of the rectangle");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * length + 2 * width;

        System.out.println("Area of the given rectangle is : " + area);
        System.out.println("Perimeter of the given rectangle is : " + perimeter);

    }
}