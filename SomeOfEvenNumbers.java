public class SomeOfEvenNumbers {

  public static void main(String[] args) {
    int num = 0;
    for (int i = 0; i < 100; i += 2) {
      num += i;
    }

    System.out.println("This is the sum of even numbers below 100: " + num);
  }
}