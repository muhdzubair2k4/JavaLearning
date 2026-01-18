package JavaLearning.Encapsulation.AccessModifiersDemonstration;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class User {
    private int id = 101;
    protected  String email = "muhhzubairtariq@gmail.com";
    String city = "Karachi";
    public String role = "Developer";

    public void Show() {
        System.out.println("Inside User Class;");
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("City: " + city);
        System.out.println("Role: " + role);
    }
}
