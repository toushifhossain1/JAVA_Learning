import java.util.Scanner;
class A11_Print_Last_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,last_digit;
        System.out.println("Enter the number : ");
        number = sc.nextInt();

        last_digit = number % 10;

        System.out.println("The last digit of " + number + " is " + last_digit);
    }
}