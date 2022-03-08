import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double nomre , zarib , jam_e_zarayeb;
        Scanner adadgir = new Scanner(System.in);
        System.out.println ("tedad e doroos ra vared konid : ");
        String str=adadgir.nextLine ();
        int x =Integer.parseInt (str);
        for (int i=0;i<x;i++) {
            Scanner adadgirr = new Scanner(System.in);
            System.out.println ("nomre dars e " + i + "ra vared konid : ");
            String strrr=adadgirr.nextLine ();
            nomre =Integer.parseInt (strrr);
            Scanner adadgirrr = new Scanner(System.in);
            System.out.println ("zarib e dars e " + i + "ra vared konid : ");
            String strr=adadgirrr.nextLine ();
            zarib =Integer.parseInt (strr);
            dars an =new dars(nomre,zarib);
            System.out.println(an.nomre);

        }
    }
}
