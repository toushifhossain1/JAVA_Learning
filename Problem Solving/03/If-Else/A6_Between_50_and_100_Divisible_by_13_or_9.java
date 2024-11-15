import java.util.Scanner;

class A6_Between_50_and_100_Divisible_by_13_or_9{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int Number;

        System.out.println("Enter a Number:");
        Number = sc.nextInt();

        if(Number>=50 && Number<=100){
            if(Number%13==0 || Number%9==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            System.out.println("No");
        }
    }
}