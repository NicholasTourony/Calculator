import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first whole number to calculate together:");
        int firstNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second whole number to calculate together:");
        int secondNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Would you like to + or - the two numbers: ");
        String operation = scanner.nextLine();
        if (operation.equals("+")) {
            int sum = firstNum + secondNum;
            System.out.println("The sum of those two numbers is: " + sum);
        }
        else if (operation.equals("-")) {
            int solution = firstNum - secondNum;
            System.out.println("The solution of those two numbers is: " + solution);
        }
        
        
    }
}