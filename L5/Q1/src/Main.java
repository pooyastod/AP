import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner Sc = new Scanner(System.in);
        Person Person1 = new Person();
        System.out.println("Username khod ra vared konid :");
        Person1.setUsername(Sc.nextLine());
        System.out.println("Nam e khod ra vared konid : ");
        Person1.setName(Sc.nextLine());
        System.out.println("Password e khod ra vared konid : ");
        Person1.setPassword(Sc.nextLine());
        System.out.println("sen e khod ra vared konid : ");
        Person1.setAge(Integer.parseInt(Sc.nextLine()));
        System.out.println("addres e khod ra vared konid : ");
        Person1.setAddress(Sc.nextLine());
        System.out.println("shomare telefon e khod ra vared konid : ");
        Person1.setPhoneNumber(Sc.nextLine());
        System.out.println("tahsilat e khod ra vared konid : ");
        Person1.setDegree(Sc.nextLine());
        System.out.println("Username : " + Person1.Username);
        System.out.println("Name : " +Person1.Name);
        System.out.println("Password : " + Person1.Password);
        System.out.println("Address : " + Person1.Address);
        System.out.println("PhoneNumber : " + Person1.PhoneNumber);
        System.out.println("Degree : " + Person1.Degree);


    }
}
