import java.util.Scanner;

class A7_Range_35_75_Divisible_by_5_but_not_2{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        int input;
        System.out.println("Please ther a number:");

        input = sc.nextInt();

        if(input>=35 && input <75){
            if(input%5 == 0 && input%2 != 0 ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
    }
}