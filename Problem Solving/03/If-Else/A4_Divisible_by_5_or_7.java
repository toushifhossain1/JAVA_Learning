import java.util.Scanner;

class A4_Divisible_by_5_or_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number;
        System.out.print("Enter Number : ");
        Number = sc.nextInt();

        if (Number % 5 == 0 && Number % 7 == 0) {
            System.out.println("Divisible by 5 and 7");
        }
        else if (Number % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        else if (Number % 7 == 0) {
            System.out.println("Divisible by 7");
        } else if (Number % 5 != 0 && Number % 7 != 0) {
            System.out.println("Number is not divisible by 5 or 7");
        } else {
            System.out.println("Invalid Number");
        }
        }
    }
