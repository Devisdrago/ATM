import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("************MENIU************");
        System.out.println("                             ");
        System.out.println("1) LOGIN ");
        System.out.println("2) EXIT ");
        System.out.println(" ");
        Account account = new Account();
        System.out.print(" INPUT : ");
        int action = scanner.nextInt();
        if (action == 1) {
            account.logIn();
        }else if(action == 2) {
            account.exit();
        } else {
            System.out.println(" Your chosen optinon dosen't exit");
        }


    }
}
