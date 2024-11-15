import java.util.Scanner;

class A10_Reverse_3_Digit_Number{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number,digit1, digit2, digit3;

        System.out.println("Please enter a 3 digit number (Anything else will give wrong output):");
        number = sc.nextInt();

        digit3 = number / 100;
        //System.out.println(digit3);
        digit2 = (number-(digit3*100)) / 10;
        //System.out.println(digit2);
        digit1 = number%10;
        //System.out.println(digit1);

        number = (digit1*100)+(digit2*10)+digit3;
        System.out.println("Reversed Number is: " + number);
    }
}