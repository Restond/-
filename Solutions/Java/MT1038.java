import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      int num2 = input.nextInt();

      int swap = num1;
      num1 = num2;
      num2 = swap;

      System.out.printf("%d %d", num1, num2);

      input.close();
   }
}
