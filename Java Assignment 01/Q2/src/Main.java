import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your full name: ");
        String firstName = scanner.next();
        String secondName = scanner.next();
        String lastName = scanner.next();

        System.out.println(lastName +", " + firstName + " " + secondName.charAt(0) + ".");

    }
}