import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        amaliat amaliat = new amaliat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("adad e avval ra vared konid :");
        double val1 = Double.parseDouble (scanner.nextLine());
        System.out.println("adad e dovvom ra vared konid :");
        double val2 = Double.parseDouble(scanner.nextLine());
        amaliat.jam(val1,val2);
        amaliat.tafrigh(val1,val2);
        amaliat.jam(val1,val2);
        amaliat.zarb(val1,val2);




    }
}
