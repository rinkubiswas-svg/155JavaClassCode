class Employee {
    String name;
    int id;
    String org;

    void details() {
        System.out.println(this.name + "," + this.id + "," + this.org);
    }

}

class Faculty extends Employee {
    String dept;

    void Facultydetails() {
        System.out.println(this.dept);
    }

}

public class l4 {
    public static void main(String[] args) {

        Faculty f1 = new Faculty();
        f1.name = "rinku";
        f1.id = 1;
        f1.org = "kiet";
        f1.dept = "sarthak";
        f1.details();
        f1.Facultydetails();

    }
}