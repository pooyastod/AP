import java.util.Scanner;
public class main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        riazi1 riazi1 = new riazi1();
        riazi2 riazi2 = new riazi2();
        riazimohandesi riazimohandesi = new riazimohandesi();
        madarelec madarelec = new madarelec();
        amarehtemal amarehtemal = new amarehtemal();
        azmatlab azmatlab = new azmatlab();
        signal signal = new signal();

        System.out.println("nam e");
        System.out.println("Nam e Dars ra az list entekhab konid\n" +
                "riazi1\n" +
                "riazi2\n" +
                "riazimohandesi\n" +
                "madarelec\n" +
                "amarehtemal\n" +
                "signal\n" +
                "azmatlab\n");
        String nam_e_dars = sc.next();
        if ("riazi1".equals(nam_e_dars)){
            riazi1.vahed();
            riazi1.hamniaz();
            riazi1.pishniaz();
        }
        else if ("riazi2".equals(nam_e_dars)){
            riazi2.vahed();
            riazi2.hamniaz();
            riazi2.pishniaz();
        }
        else if ("riazimohandesi".equals(nam_e_dars)){
            riazimohandesi.vahed();
            riazimohandesi.hamniaz();
            riazimohandesi.pishniaz();
        }
        else if ("madarelec".equals(nam_e_dars)){
            madarelec.vahed();
            madarelec.hamniaz();
            madarelec.pishniaz();
        }
        else if ("amarehtemal".equals(nam_e_dars)){
            amarehtemal.vahed();
            amarehtemal.hamniaz();
            amarehtemal.pishniaz();
        }
        else if ("signal".equals(nam_e_dars)){
            signal.vahed();
            signal.hamniaz();
            signal.pishniaz();
        }
        else if ("azmatlab".equals(nam_e_dars)){
            azmatlab.vahed();
            azmatlab.hamniaz();
            azmatlab.pishniaz();
        }
        else
            System.out.println("Nam e dars ghalat vared shode ast");
    }
}