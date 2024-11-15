import java.util.Scanner;

class A5_Faremheit_to_Celsius_and_Kelvin{
    public static void main (String[] args){
        double Farenheit;
        double Celsius;
        double Kelvin;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the temperature in Fahrenheit");

        Farenheit = sc.nextDouble();

        Celsius = ((5*(Farenheit - 32))/9);

        Kelvin = Celsius + 273.15;

        System.out.println("Celsius = " + Celsius);
        System.out.println("Kelvin = " + Kelvin);
    }
}