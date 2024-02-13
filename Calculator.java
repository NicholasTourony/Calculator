import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first whole number to calculate together:");
        float firstNum = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the second whole number to calculate together:");
        float secondNum = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Would you like to +, -, x, or / the two numbers: ");
        String operation = scanner.nextLine();
        if (operation.equals("+")) {
            float sum = firstNum + secondNum;
            System.out.println("The sum of those two numbers is: " + sum);
        }
        else if (operation.equals("-")) {
            float solution = firstNum - secondNum;
            System.out.println("The solution of those two numbers is: " + solution);
        }
        else if (operation.equals("x")) {
            float product = firstNum * secondNum;
            System.out.println("The product of those two numbers is: " + product);
        }
        else if (operation.equals("/")) {
            if (secondNum == 0)
            {
                System.out.println("Error: Divide by Zero");
            } else {
                float quotient = firstNum / secondNum;
                System.out.println("The quotient of those two numbers is: " + quotient);
            }
        }
    }
}