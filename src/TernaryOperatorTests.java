public class TernaryOperatorTests {
    public static void main(String[] args) {
        int age = 18;

        String result;

        if (age == 100) {
            result = "WOW!";
        } else if (age >= 18) {
            result = "+";
        } else {
            result = "-";
        }

        result = age >= 18 ? "+" : "-";

        System.out.println("result = " + result);
    }
}
