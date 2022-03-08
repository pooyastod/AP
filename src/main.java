import java.util.Scanner;
public class main {
    public static void main(String[] args){
        System.out.println("adad ra vared konid : ");
        Scanner sc = new Scanner (System.in);
        int adad =  Integer.parseInt(sc.next());
        ForInt ForInt = new ForInt();
        ForInt.isEven(adad);
        ForInt.isOdd(adad);
        ForInt.isZero(adad);
        ForInt.isNegative(adad);
        ForInt.isPositive(adad);
    }
}
