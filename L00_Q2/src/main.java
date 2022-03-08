public class main {
    public static void main(String[] args) {
        int maximum_number = 0;
        int aadad[] = {78, 45, 46, 46, 6, 46, 4, 849, 2629, 44, 949, 41, 21, -45985959, 1919};
        for (int i = 0; i < aadad.length; i++) {
            if (aadad[i] >= maximum_number) {
                maximum_number = aadad[i];
            }
        }
        System.out.println("maximum number = " + maximum_number);
    }
}