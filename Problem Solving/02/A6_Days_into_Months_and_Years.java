import java.util.Scanner;

class A6_Days_into_Months_and_Years{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years,months;

        System.out.println("Please enter the number of days");
        int days = sc.nextInt();

        years = days / 365;
        months = (days % 365) / 30;
        days = (days % 365) % 30;

        System.out.println(years + " Years " + months + " Months " + days + " Days");
    }
}