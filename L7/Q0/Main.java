import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("etelaat e khod ra vared konid (Name,PassWord,UserName,Email)");
            UserServ.getInstance().write(
                    new UserEnti().setName(scanner.nextLine()).setPass(scanner.nextLine())
                            .setUserName(scanner.nextLine()).setEmail(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println ("Re enter yoour data ... "+e.getMessage ());
        }
        try {
            System.out.println(UserServ.getInstance().report());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
