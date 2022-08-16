import java.util.Scanner;

public class IfAgeTest {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();

        boolean isAgeIncorrect = age < 0 || age > 100;

        if (isAgeIncorrect) {
            System.out.println("Вы ввели что-то некорректное");
        } else {
            if (age == 100) {
                System.out.println("Вы долгожитель");
            } else if (age >= 18) {
                System.out.println("Ты уже совершеннолетний");
            } else {
                System.out.println("Ты еще несовершеннолетний");
            }
        }


    }
}
