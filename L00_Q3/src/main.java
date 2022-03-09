public class main {
    public static void main(String[] args) {
        double a,b,result;
        b = 8;
        a = 5;
        for(int i=1;i<=4;i++) {
            switch (i) {
                case 1:
                    result = a + b;
                    System.out.println("hasel jam : " + result);
                    break;
                case 2:
                    if (a>b) {
                        result = a - b;
                    }
                    else{
                        result = b - a;
                    }
                    System.out.println("ekhtelaf : " + result);
                    break;
                case 3:
                    result = a * b;
                    System.out.println("hasel zarb : " + result);
                    break;
                case 4:
                    result = a / b;
                    System.out.println("hasel taghsim : " + result);
                    break;
            }
        }
    }
}