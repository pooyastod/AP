import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Daneshjoo Daneshjoo = new Daneshjoo();
        Scanner Sc = new Scanner(System.in);
        List<Double> Grades = new ArrayList<Double>();
        System.out.println("Nam e khod ra vared konid : ");
        Daneshjoo.setName(Sc.nextLine());
        System.out.println("Shomare daneshjooyi e khod ra vared konid : ");
        Daneshjoo.setSTD_num(Sc.nextLine());
        System.out.println("Nam e pedar e khod ra vared konid : ");
        Daneshjoo.setFname(Sc.nextLine());
        for (int i = 1;i<=5;i++){
            System.out.println("nomreye " + i + " om ra vared konid : ");
            Grades.add(Double.parseDouble(Sc.nextLine()));
        }
        System.out.println("nam e daneshjoo : " +Daneshjoo.Name);
        System.out.println("shomare daneshjooyi : " + Daneshjoo.STD_num);
        System.out.println("nam e pedar e daneshjoo : " + Daneshjoo.Fname);
        System.out.println("nomarat : " +Grades);
    }
}
