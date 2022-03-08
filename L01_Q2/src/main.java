import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double nomre , zarib , jam_e_zarayeb,nomrekham,arzesh;
        nomrekham= 0 ;
        jam_e_zarayeb = 0 ;
        Scanner adadgir = new Scanner(System.in);
        System.out.println ("tedad e doroos ra vared konid : ");
        String str=adadgir.nextLine ();
        int x =Integer.parseInt (str);
        for (int i=0;i<x;i++) {
            Scanner adadgirr = new Scanner(System.in);
            System.out.println ("nomre dars e " + i + "ra vared konid : ");
            String strrr=adadgirr.nextLine ();
            nomre =zarib = Double.parseDouble (strrr);
            Scanner adadgirrr = new Scanner(System.in);
            System.out.println ("zarib e dars e " + i + "ra vared konid : ");
            String strr=adadgirrr.nextLine ();
            zarib = Double.parseDouble (strr);
            arzesh = nomre * zarib;
            nomrekham += arzesh;
            jam_e_zarayeb += zarib;
            if (zarib>3 | zarib < 0 |nomre>20 | nomre < 0) {
                System.out.println("nomre bayad beyn e 0 va 20 va zarib bayad beyn e 1 va 3 bashad");
                System.out.println("dobare vared konid");
                nomrekham -= arzesh;
                jam_e_zarayeb -= zarib;
                i--;
            }
        }
        double moadel = nomrekham / jam_e_zarayeb;
        if (moadel>=12)
            System.out.println("mashroot nashodi");
        else
            System.out.println("mashroot shodi");
        System.out.print("moadel e kasb shode : ");

        System.out.println(moadel);
    }
}