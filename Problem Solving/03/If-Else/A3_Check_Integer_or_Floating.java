import java.util.Scanner;

class A2_Check_Positive_or_Negative{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double Number;
        int intChecker;

        System.out.println("Please enter a number");
        Number = sc.nextDouble();

        intChecker = (int)Number;

        if (intChecker == Number){
            System.out.println("The number is Integer");
        }
        else {
            System.out.println("The number is Floating Point");
        }
    }
}