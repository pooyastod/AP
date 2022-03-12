import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] u1 = new String[3];
        String[] u2 = new String[3];
        String[] data = {"name","age","family"};
        for (int i =0 ; i < 3 ; i++){
            System.out.println("USER1 : Please enter your " + data[i]);
           u1[i] = sc.nextLine();
        }
        for (int i =0 ; i < 3 ; i++){
            System.out.println("USER2 : Please enter your " + data[i]);
            u2[i] = sc.nextLine();
        }
        if (u1[0].equals(u2[0]) && u1[1].equals(u2[1]) && u1[2].equals(u2[2])){
            try {
                throw new error("har do karbar yeksanand");
            } catch (error e) {
                System.out.println("har do karbar yeksanand");
            }
        }
    }
}
