import java.util.Arrays;

public class ArrayTests {
    public static void main(String[] args) {
        //Петя, Вася, Коля
        String[] names = new String[3]; //index - 0..2
        names[0] = "Петя";
        names[1] = "Вася";
        names[2] = "Коля";

        //Print array size
        System.out.println("names.length = " + names.length);

        //Print last element
        System.out.println("names[names.length - 1] = " + names[names.length - 1]);

        //Print all
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        //Print first element
        String firstName = names[0];
        System.out.println("firstName = " + firstName);

        //Rewrite element
        names[0] = "John";
        System.out.println("names[0] = " + names[0]);

        //Initialize array during creation
        String[] fruits = {"Apple", "Banana"};
        System.out.println("Arrays.toString(fruits) = " + Arrays.toString(fruits));

        //Test multidimensional arrays
        String[][] keyboard = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"+", "0", "-"}
        };

        System.out.println("Arrays.toString(keyboard[0]) = " + Arrays.toString(keyboard[0]));
        System.out.println("Arrays.toString(keyboard[1]) = " + Arrays.toString(keyboard[1]));
        System.out.println("Arrays.toString(keyboard[2]) = " + Arrays.toString(keyboard[2]));
        System.out.println("Arrays.toString(keyboard[3]) = " + Arrays.toString(keyboard[3]));

        //Test print non-initialized array
        String[] emptyValues = new String[3];
        System.out.println("Arrays.toString(emptyValues) = " + Arrays.toString(emptyValues));

        int[] emptyInts = new int[5];
        System.out.println("Arrays.toString(emptyInts) = " + Arrays.toString(emptyInts));

    }
}
