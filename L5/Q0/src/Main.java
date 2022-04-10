import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class Main {
    public static void main(String[] args) {
        int x = 0,y=0,m=10;

        calcFactory mfactory=new calcFactory();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Calculator mc=mfactory.get("");
        if (input.contains("+")){
            mc=mfactory.get("+");
            m = input.indexOf("+");
            x = parseInt(input.substring(0,m));
            y = parseInt(input.substring(m+1));
        }
        if (input.contains("-")){
            mc=mfactory.get("-");
            m = input.indexOf("-");
            x = parseInt(input.substring(0,m));
            y = parseInt(input.substring(m+1));
        }
        if(mc!=null){
            System.out.println(mc.calculate(x, y));
        }else
        {
            System.out.println("current request is not available");
        }
    }
}