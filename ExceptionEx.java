//unchecked Exception
public class ExceptionEx {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(4);
        try {
            System.out.println(100 / 0);
            System.out.println("we are try to print after the exception line");
            System.out.println(5);
        } catch (Exception e) {

            e.printStackTrace();
        }

        finally {
            System.out.println("finally block is finally executed");
            System.out.println(5);
            System.out.println(6);
        }

    }

}
