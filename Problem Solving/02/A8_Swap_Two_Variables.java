import java.util.Scanner;

class A8_Swap_Two_Variables{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("Please enter the first number: ");
        num1 = sc.nextDouble();
        System.out.println("Please enter the second number: ");
        num2 = sc.nextDouble();

        System.out.println("Before Changing, Number 1 = " + num1 + " Number 2 = " + num2);
        //using third variable
        double temp;
        temp = num1;
        num1 = num2;
        num2 = temp;


        //Without third variable
        //num1 = num1+num2;
        //num2 = num1-num2;
        //num1 = num1-num2;

        System.out.println("After Changing, Number 1 = " + num1 + " Number 2 = " + num2);
    }
}