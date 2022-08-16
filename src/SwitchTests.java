import java.util.Scanner;

public class SwitchTests {
    public static final int MAX = 100;

    public static void main(String[] args) {
        /*
        Есть число. Если оно равно 5 - то вывести Fizz,
        если оно равно 3 - то вывести Buzz,
        если оно равно 15 - вывести FizzBuzz
         */

        int number = new Scanner(System.in).nextInt();

//        if (number == 5) {
//            System.out.println("Fizz");
//        } else if (number == 3) {
//            System.out.println("Buzz");
//        } else if (number == 15) {
//            System.out.println("FizzBuzz");
//        }

        switch (number) {
            case MAX: System.out.println("Fizz"); break;
            case 3: System.out.println("Buzz"); break;
            case 15: System.out.println("FizzBuzz"); break;
            default: System.out.println("Something else");
        }


    }
}
