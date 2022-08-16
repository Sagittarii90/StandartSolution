import java.util.Scanner;

public class IfReadBooleanTests {
    public static void main(String[] args) {
        if (new Scanner(System.in).nextBoolean()) {
            System.out.println("Вы ввели true");
        } else {
            System.out.println("Вы ввели false");
        }
    }
}
