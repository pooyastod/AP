import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("reshte ra vared konid : ");
        String str = sc.nextLine();
        String testnum;
        for (int i = 0; i < 10; i++) {
            testnum = String.valueOf(i);
            boolean test = str.contains(testnum);
            if (test) {
                try {
                    throw new error("reshte havi e adad ast");
                } catch (error e) {
                    System.out.println("reshte havi e adad ast");
                    i = 90;
                }
            }
            if (i == 9) {
                System.out.println("tool e matn barabar ast ba : " + str.length());
            }

        }
    }
}
