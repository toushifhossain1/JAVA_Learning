import java.util.*;

public class Variables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input '1' for 'Hello', '2' for 'Nm', '3' for 'Bonjour'");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Nm");
                break;
            case 3:
                System.out.println("Bonjour");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }

    }
}