package JavaLearning.Encapsulation.AccessModifiersDemonstration;

public class TestAccess {
    public static void main(String[] args) {
        User user = new User();

        user.Show();//due to public method

        System.out.println("\nInside TestAccess Class;");
//        System.out.println("ID: " + user.id); //due to private
        System.out.println("Email: " + user.email);
        System.out.println("City: " + user.city);
        System.out.println("Role: " + user.role);
    }



}
