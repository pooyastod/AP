import java.util.Scanner;
public class Main {
    public static void main (String [] args) throws CloneNotSupportedException {
        Scanner Sc = new Scanner(System.in);
        User User1 = new User();
        System.out.println("Nam e khod ra vared konid : ");
        User1.setName(Sc.nextLine());
        System.out.println("Tarikh e tavalod e khod ra vared konid : ");
        User1.setDateofbirth(Sc.nextLine());
        System.out.println("jensiat e khod ra vared konid : ");
        User1.setGender(Sc.nextLine());
        User User2 = (User) User1.clone();
        User User3 = (User) User1.clone();
        User User4 = (User) User1.clone();
        System.out.println("User2 Name : " + User2.Name);
        System.out.println("User3 DAte of birth : " + User3.Dateofbirth);
        System.out.println("User4 Gender : " + User4.Gender);
    }
}
