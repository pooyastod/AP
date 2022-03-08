import java.util.Scanner;

public class dars {
    double nomre;
    double zarib;
    public void arzesh(double nomre , double zarib,double nomrenahayi){
        this.zarib = zarib;
        this.nomre = nomre;
        System.out.println(nomre * zarib);
        nomrenahayi = nomre + zarib;
    }
    public void nomregir(){
        Scanner adadgirr = new Scanner(System.in);
        System.out.println ("nomre dars ra vared konid : ");
        String strrr=adadgirr.nextLine ();
        nomre =zarib = Double.parseDouble (strrr);
    }
    public void zaribgir(){
        Scanner adadgirr = new Scanner(System.in);
        System.out.println ("zarib e dars ra vared konid : ");
        String strrr=adadgirr.nextLine ();
        nomre =zarib = Double.parseDouble (strrr);
    }


}