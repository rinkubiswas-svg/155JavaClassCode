class EmployeeStatic {
    int Emp_id;
    String org;
    static int salary;

    static {
        String address = "ghurna";
    }

    void details() {
        System.out.println(Emp_id + "," + org + "," + salary);
    }

    static void print() {
        System.out.println("this is a static method");
    }

    public static void main(String[] args) {

        EmployeeStatic.salary = 10000;

        EmployeeStatic e1 = new EmployeeStatic();
        e1.Emp_id = 1;
        e1.org = "kiet";
        e1.details();
        EmployeeStatic.print();

        EmployeeStatic e2 = new EmployeeStatic();
        e2.Emp_id = 2;
        e2.org = "abes";
        e2.details();

    }

}
