import java.util.Scanner;
import java.util.StringTokenizer;

public class LW2Q5 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a sentence: ");
                String sentence = scanner.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:'\"()-");
                StringBuilder cleanText = new StringBuilder();

                while (tokenizer.hasMoreTokens()) {
                    cleanText.append(tokenizer.nextToken().toLowerCase());
                }

                boolean isPalindrome = isPalindrome(cleanText.toString());

                if (isPalindrome) {
                    System.out.println("The sentence is a palindrome.");
                } else {
                    System.out.println("The sentence is not a palindrome.");
                }
            }

            public static boolean isPalindrome(String text) {
                int left = 0;
                int right = text.length() - 1;

                while (left < right) {
                    if (text.charAt(left) != text.charAt(right)) {
                        return false;
                    }
                    left++;
                    right--;
                }
                return true;
            }
        }
