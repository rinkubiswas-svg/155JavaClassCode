class EmployeeRunPM {
    String Emp_name;

    void details() {
        System.out.println("Name" + Emp_name);
    }

    void details(int salary) {
        System.out.println("salary" + salary);
    }

    void details(String Emp_name, int salary) {
        
        System.out.println(Emp_name + "," + salary);

    }

}

class Faculty extends EmployeeRunPM {
    void details() {
        super.details();
        System.out.println("Welcome Faculties.");
    }
}

public class RunPolyMor {
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        f1.Emp_name = "Rinku";
        f1.details();
    }
}
