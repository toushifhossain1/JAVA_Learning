import java.util.Scanner;

class A12_Seperate_Int_and_Dec{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        double number, floatPart;
        int intPart;

        System.out.println("Please enter a number: ");
        number = sc.nextDouble();

        intPart = (int)number;
        floatPart = number - intPart;
        floatPart = Math.round(floatPart * 1000000.0) / 1000000.0;

        System.out.println("Int part: " + intPart + " Float part: " + floatPart);
    }
}