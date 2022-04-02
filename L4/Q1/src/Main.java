import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner Sc = new Scanner(System.in);
        Map map = new HashMap();
        List<String> STDinfo = new ArrayList<String>();
        System.out.println("Shomare daneshjooyi : ");
        STDinfo.add(Sc.nextLine());
        System.out.println("Nam e daneshjoo : ");
        STDinfo.add(Sc.nextLine());
        System.out.println("moadel e daneshjoo : ");
        double moadel = Double.parseDouble(Sc.nextLine());
        map.put(STDinfo, moadel);
        System.out.println(map);
    }
}