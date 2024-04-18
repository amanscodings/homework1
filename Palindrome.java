import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String reverse = new StringBuilder(userInput).reverse().toString();

        if (userInput.equals(reverse)) {
            System.out.println(userInput + " is a palindrome");
        } else {
            System.out.println(userInput + " is not a palindrome");
        }
    }
}