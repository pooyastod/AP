import java.util.Scanner;
public class User {
    private static User User;
    public synchronized static User
    getLogInstance(){
        if(User==null)
        {
            User=new User();
        }
        return User;
    }
    private User(){}
    public void Info(){
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        person.setName(sc.nextLine());
        System.out.println("Enter Username : ");
        person.setUsername(sc.nextLine());
        System.out.println(person.Name);
        System.out.println(person.Username);
    }
}