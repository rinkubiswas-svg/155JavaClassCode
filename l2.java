class EmployeeStatic {
    int Emp_id;
    final String org = "abes";

    void details() {
        System.out.println(Emp_id + "," + org);
    }

    public static void main(String[] args) {

        EmployeeStatic e1 = new EmployeeStatic();
        e1.Emp_id = 1;
        // e1.org = "kiet";//give you error due to final keyword
        e1.details();

    }

}
