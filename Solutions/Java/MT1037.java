import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    System.out.printf("%.6f", Math.abs(a));
    input.close();
  }
}
