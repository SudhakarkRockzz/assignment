import java.util.Scanner;

public class ScannerEx {  // Changed class name to avoid conflict
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Use consistent variable name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();  // Correct variable usage
        System.out.println("Your name is: " + name);
        scanner.close();
    }
}
