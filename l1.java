public class l1 {
    private static String name = "rinku";

    class nestedClass {
        static void message() {
            System.out.println("message" + l1.name);
        }

    }

    public static void main(String[] args) {
        nestedClass.message();

    }

}
