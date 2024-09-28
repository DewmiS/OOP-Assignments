import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = scanner.next();

        if(word.length() % 2 == 0){
            System.out.println("Not an odd-length word");
        }else{
            System.out.println("The middle character of the string: " + word.charAt(word.length()/2));
        }
    }
}