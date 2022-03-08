import java.util.Scanner;
public class mainn {
    public static void main(String[] args) {
        shekl morabba = new shekl();
        shekl mostatil = new shekl();
        double x,y;
        System.out.println("agar shekl morabba bashad tool be onvan arz niz farz mishavad");
        Scanner adadgir = new Scanner(System.in);
        System.out.println ("tool ra vared konid : ");
        String str=adadgir.nextLine ();
        x =Double.parseDouble (str);
        System.out.println ("ertefa ra vared konid : ");
        String strr=adadgir.nextLine ();
        y =Double.parseDouble (strr);
        morabba.tool = x;
        morabba.arz = x;
        mostatil.tool = x;
        mostatil.arz = y;
        System.out.print("masahat e morabba be tool e " + x + " barabar ast ba ");
        morabba.masahat(morabba.tool,morabba.arz);
        System.out.print("masahat e mostatil be tool e " + x + " va arz e " + y + " barabar ast ba ");
        mostatil.masahat(mostatil.tool,mostatil.arz);
        System.out.print("mohit e morabba be tool e " + x + " barabar ast ba ");
        morabba.mohit(morabba.tool,morabba.arz);
        System.out.print("mohit e mostatil be tool e " + x + " va arz e " + y + " barabar ast ba ");
        mostatil.mohit(mostatil.tool,mostatil.arz);
    }
}