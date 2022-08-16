public class ToStringTests {
    public static void main(String[] args) {
        System.out.println("new ToStringTests() = " + new ToStringTests());
    }

    @Override
    public String toString() {
        return "This is ToStringTests()";
    }
}
