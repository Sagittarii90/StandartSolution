import java.text.NumberFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number 1");
        double number1 = input.nextDouble();

        System.out.println("Input number 2");
        double number2 = input.nextDouble();

        var result = number1 / number2;
        System.out.println("Result: " + result);
    }
//public static void main(String[] args) {
//    var input = new Scanner(System.in);
//
//        System.out.println("Input number 1");
//        var number1 = input.nextDouble();
//
//        System.out.println("Input number 2");
//        var number2 = input.nextDouble();
//
////        double result = number1 / number2;
//        var sum = number1 / number2;
//        var result = NumberFormat.getIntegerInstance();
//            System.out.println(sum);
//}
    }
