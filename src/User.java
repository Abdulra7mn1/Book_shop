import java.util.ArrayList;
import java.util.Scanner;
public class User extends Info {

    static Scanner  input = new Scanner(System.in);
    static ArrayList<User> users_list = new ArrayList<User>();

    static public void register()
    {

        System.out.println("Enter username :");
        String name = input.next();
        System.out.println("Enter password :");
        String password = input.next();
        System.out.println("Enter your age");
        int age = input.nextInt();

        User u = new User();
        u.setUser_name(name);
        u.setPassword(password);
        u.setAge(age);

        User.users_list.add(u);
    }

    static public boolean login()
    {
        System.out.println("Enter username :");
        String name = input.next();
        System.out.println("Enter password :");
        String pass = input.next();

        for (User u : User.users_list)
        {
            if (name.equals(u.getUser_name()) && pass.equals(u.getPassword()))
            {
                return true;
            }

        }
        return false;
    }



}
