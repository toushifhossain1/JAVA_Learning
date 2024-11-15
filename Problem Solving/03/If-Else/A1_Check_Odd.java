import java.util.Scanner;

class A1_Check_Odd{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int Number;
        System.out.print("Enter a Number : ");
        Number = sc.nextInt();

        if (Number % 2 == 0){
            System.out.printf("The Number %d is even", Number);
        }
        else if (Number % 2 == 1) {
            System.out.printf("The Number %d is odd", Number);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}