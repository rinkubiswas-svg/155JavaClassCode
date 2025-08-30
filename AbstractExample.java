abstract class College {
    abstract void Register();

    abstract void Infrastructure();

    abstract void Students();

    abstract void Staff();

    void MedicalFacility() {
        System.out.println("Medical facility are optional");
    }

}

class KIETT extends College {
    void Register() {
        System.out.println("Kiet register is open");
    }

    void Infrastructure() {
        System.out.println("Infrastructue is good");
    }

    void Students() {
        System.out.println("Students seats are limited");

    }

    void Staff() {
        System.out.println("Their are 100 staffs");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        College cg = new KIETT();
        cg.Register();
        cg.Infrastructure();
        cg.Infrastructure();
        cg.Staff();
        cg.MedicalFacility();

    }

}
