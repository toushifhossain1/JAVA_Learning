import java.util.Scanner;

class A4_Height_from_Meter_to_Feet{

    public static void main (String[] args){
        double height_in_Meter;
        double height_in_Feet;
        double height_in_Inches;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter you height in Meters:");
        height_in_Meter = sc.nextDouble();

        height_in_Inches = (height_in_Meter * 100) / 2.54;
        height_in_Feet = height_in_Inches / 12;

        System.out.println("Your height in feet is: " + height_in_Feet);
    }
}