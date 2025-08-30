class polyMorphism {
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

    public static void main(String[] args) {
        polyMorphism m1 = new polyMorphism();
        m1.Emp_name = "Rinku";
        m1.details();
        m1.details(2000);
        m1.details("Pinku", 20000);
    }

}
