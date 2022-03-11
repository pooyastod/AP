import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        List<String> users = Arrays.asList("mohammadmohammadi", "hosseinhosseini", "hassanhassani");
        List<String> passwords = Arrays.asList("1234", "2345", "3456");
        Scanner sc = new Scanner(System.in);
        System.out.println("nam e khod ra vared konid");
        String name = sc.nextLine();
        System.out.println("nam e khanevadegi e khod ra vared konid");
        String family = sc.nextLine();
        System.out.println("gozarvajhe e khod ra vared konid");
        String password = sc.nextLine();
        String wannabe = name + family ;
        for (int i = 0 ; i <users.size();i++) {
            if (users.get(i).equals(wannabe))
                if (passwords.get(i).equals(password))
                    System.out.println("vared shodid");
                else {
                    try {
                        System.out.print(1 / 0);
                    } catch (Exception e) {
                        System.out.println("gozarvazhe nadorost ast");
                        i += 90;
                    } finally {
                    }
                }
            if (users.size() - 1 == i)
                 System.out.println("karbar yaft nashod");
        }
        }
    }