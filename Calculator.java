import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first whole number to add together:");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second whole number to add together:");
        int secondNum = scanner.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sum of those two numbers is: " + sum);
    }
}