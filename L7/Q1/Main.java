
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        NetEnt ent = new NetEnt();
        NetRepo repo = new NetRepo();
        Scanner sc = new Scanner(System.in);
        String inputUsername ,inputPass ;
        System.out.println("nam e karbari e khod ra vared konid : ");
        inputUsername = sc.nextLine();
        System.out.println("password e khod ra vared konid : ");
        inputPass = sc.nextLine();
        ent.setUsername(inputUsername);
        ent.setPass(inputPass);

        if (!repo.select(ent).isEmpty()) {
            if (inputUsername.equals(repo.select(ent).get(0))){
                if (inputPass.equals(repo.select(ent).get(1))){
                    int CurrentNet = Integer.parseInt(repo.select(ent).get(2));
                    long Money = Long.parseLong(repo.select(ent).get(3));
                    int c=0;
                    c = sc.nextInt();
                    switch (c){
                        case 1 :
                            ent.setNet(CurrentNet +2);
                            ent.setMoney(Money -1000);
                            repo.update(ent);
                            break;
                        case 2 :
                            ent.setNet(CurrentNet +4);
                            ent.setMoney(Money -2000);
                            repo.update(ent);
                            break;
                        case 3 :
                            ent.setNet(CurrentNet +10);
                            ent.setMoney(Money -5000);
                            repo.update(ent);
                            break;
                        case 4 :
                            ent.setNet(CurrentNet +25);
                            ent.setMoney(Money -10000);
                            repo.update(ent);
                            break;
                    }
                }else{
                    System.out.println("password nadorost ast");
                }

            }
        } else {
            System.out.println("Error");
        }
    }
}

