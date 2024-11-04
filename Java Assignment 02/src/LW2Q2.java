import java.util.Scanner;

public class LW2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        while (!(number == 0)){
            number = number / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
