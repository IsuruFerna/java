import java.util.Scanner;

public class FactorialNumber {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num = scanner.nextInt();
    int factorial = 1;

    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }

    System.out.println("Factorial of " + num + " is " + factorial);

    scanner.close();
  }
}