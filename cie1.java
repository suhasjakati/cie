import java.util.Scanner;

public class cie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt();

        if (number % 2 == 0) { 
            System.out.println(number + " is even."); 
        } else {
            System.out.println(number + " is odd."); 
        }

        scanner.close();
        System.out.println("This is a simple program to check if a number is even or odd.");
    }
}