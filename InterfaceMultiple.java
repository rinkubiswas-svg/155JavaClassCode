interface Teaching {
    void work();

}

interface Research {
    void research();

}

class Professor implements Teaching, Research {
    public void work() {
        System.out.println("doing work");
    }

    public void research() {
        System.out.println("doing research");
    }
}

public class InterfaceMultiple {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.work();
        p.research();

    }
}
