import java.io.InputStream;
import java.util.Scanner;

public class SystemOutPrintlnTests {
    public static void main(String[] args) {
      testSum();
    }

    public static void testSystemIn() {
        InputStream in = System.in; //Read from keyboard 99.99%
        Scanner scanner = new Scanner(in);

        int number = scanner.nextInt();

        System.out.println("number = " + number);
    }

    public static void testStringRead() {
        Scanner scanner = new Scanner("10 20 30");

        int firstNumber = scanner.nextInt(); //432413 432423

        System.out.println("firstNumber = " + firstNumber);
    }

    public static void testSum() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("sum = " + sum);
    }
}
