import java.util.Scanner;

class Employee {
    private int Account_bal;
    private int upi_pin = 998899;

    public void setBalance(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter upi pin");
        int pin = sc.nextInt();

        if (pin == upi_pin) {
            Account_bal = balance;
            System.out.println("balance fetched");
        } else {
            System.out.println("balance is not fetched");
        }

        sc.close();
    }

    public int getBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("TO know balance enter your upi pin");
        int pin = sc.nextInt();
        if (pin == upi_pin) {
            System.out.println("Your balance" + Account_bal);
            return Account_bal;
        } else {
            System.out.println("you entered wrong pin");
        }
        return -1;

    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Employee eb = new Employee();
        eb.setBalance(999);
        System.out.println(eb.getBalance());

    }

}
