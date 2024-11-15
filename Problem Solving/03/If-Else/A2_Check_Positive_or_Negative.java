import java.util.Scanner;

class A2_Check_Positive_or_Negative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double Number;

        System.out.println("PLease enter a number");
        Number = sc.nextDouble();

        if (Number >0){
            System.out.println("Number is positive");
        }
        else if (Number <0) {
            System.out.println("Number is negative");
        }
        else if (Number == 0) {
            System.out.println("Number is zero");
        }
        else {
            System.out.println("Invalid Input");
        }


    }
}