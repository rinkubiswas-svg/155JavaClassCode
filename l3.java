class l3 {
    int Emp_id;
    String org = "abes";

    void details() {
        System.out.println(Emp_id + "," + org);
    }
}

class Faculty extends l3 {
    // void details() {
    // System.out.println("i am overriding");
    // }

    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        f1.details();

    }

}
