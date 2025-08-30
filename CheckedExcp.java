//checked exception

import java.io.FileInputStream;

public class CheckedExcp {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("c:/users /Desktop/txt.file");
        } catch (Exception e) {
            System.out.println("we are trying to handle the exception");

        }

    }

}
