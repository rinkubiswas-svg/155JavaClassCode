
interface institue {
    void Register();

    void Infrastructure();

    void Students();

    void Staff();

    // this all three methods are not possible in older version of java
    static void staticConcrete() {
        System.out.println("allows in java after java 8 ");

    }

    default void defaultConcrete() {
        privateConcrete();
        System.out.println("allows in java after java 8");

    }

    private void privateConcrete() {
        System.out.println("allows in java after java 9");

    }

}

class ABES implements institue {
    public void Register() {

        System.out.println("Kiet register is open");
    }

    public void Infrastructure() {
        System.out.println("Infrastructue is good");
    }

    public void Students() {
        System.out.println("Students seats are limited");

    }

    public void Staff() {
        System.out.println("Their are 100 staffs");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        institue e = new ABES(); // only interface level method will able to show
        // ABES e = new ABES(); // can able to show all inherit methods
        e.Register();
        e.Infrastructure();
        e.Students();
        e.Staff();
        e.defaultConcrete();

        institue.staticConcrete();

    }

}
