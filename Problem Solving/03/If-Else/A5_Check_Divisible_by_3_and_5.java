import java.util.Scanner;

class A5_Check_Divisible_by_3_and_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("Divisible by 3 and 5");
        }
        else if(number % 3 != 0 || number % 5 != 0){
            System.out.println("Not divisible by 3 and 5");
        }
        else{
            System.out.println("Invalid");
        }
    }
}