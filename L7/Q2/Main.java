import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        CarEnt carsEnt = new CarEnt();
        CarUserEnt carUserEnt = new CarUserEnt();
        CarRepo carsRepo = new CarRepo();
        Scanner sc = new Scanner(System.in);
        System.out.println("nam e karbari e khod ra vared konid : ");
        String username = sc.nextLine();
        System.out.println("password e khod ra vared konid : ");
        String pass = sc.nextLine();
        carUserEnt.setUsername(username).setPass(pass);
        try {
            if(carsRepo.selectUserC(carUserEnt,carsEnt).isEmpty()){
                System.out.println("error");
            }else if (username.equals(carsRepo.selectUserC(carUserEnt,carsEnt).get(1))){
                if (pass.equals(carsRepo.selectUserC(carUserEnt,carsEnt).get(2))){
                    System.out.println("shomare e mashin ra entekhab konid : 1)shahin 2)pride");
                    int c = sc.nextInt();
                    carsEnt.setId(c);
                    for (String a:carsRepo.selectCAR(carUserEnt,carsEnt)){
                        System.out.println(a);
                    }
                    System.out.println("dar hal e kharid e : ");
                    long price = Long.parseLong(carsRepo.selectCAR(carUserEnt,carsEnt).get(3));
                    long currentMoney = Long.parseLong(carsRepo.selectUserC(carUserEnt,carsEnt).get(3));
                    carUserEnt.setMoney(currentMoney-price);
                    carsRepo.update(carUserEnt,carsEnt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
