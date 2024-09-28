import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in centimetres: ");
        double length = scanner.nextDouble();
        int feet;
        double inches;
        feet = (int)(length / 30.48);
        inches = (length - feet*30.48)/2.54;
        System.out.println(length + "cm: " + feet + " feet/s and " + inches + " cm");
    }
}