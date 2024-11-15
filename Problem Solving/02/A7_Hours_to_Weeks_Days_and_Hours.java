import java.util.Scanner;

class A7_Hours_to_Weeks_Days_and_Hours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours, days, weeks;

        System.out.println("Please enter the number of Hours:");
        hours = sc.nextInt();

        weeks = (hours / 168);  //1 week = 168 hours
        days = ((hours % 168) / 24);
        hours = ( (hours % 168) % 24);

        System.out.println("Weeks: " + weeks + " Days: " + days + " Hours: " + hours);
    }
}