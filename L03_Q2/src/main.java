import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double c = Double.parseDouble(sc.next());
        double Delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println(Delta);
        if (a == 0) {
            if (b == 0) {
                System.out.println("moadele dar vaghe adad ast :)");
                System.exit(0);
            }
            else
                {
                    double rishe0 = c / b;
                    System.out.println("rishe barabar ast ba  : " + rishe0);
                }

            }
        if (Delta < 0) {
            try {
                System.out.println(1 / 0);
            } catch (Exception e) {
                System.out.println("Delta manfi ast");
            }
        }
        if (Delta == 0) {
            double rishe = -b / (2 * a);
            System.out.println("rishe barabar ast ba : " + rishe);
        }
        if (Delta > 0) {
            double rishe1 = (-b - Math.sqrt(Delta) / (2 * a));
            double rishe2 = (-b + Math.sqrt(Delta) / (2 * a));
            System.out.println("Rishe avval barabar ast ba : " + rishe1 + " va rishe 2vom barabar ast ba : " + rishe2);
        }
        }
    }


