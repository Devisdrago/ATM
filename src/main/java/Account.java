import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {

    private final long id = 12345;
    private int pin = 1234;
    private int balance = 0;

    public void logIn() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("  ID : ");
        int id = scanner.nextInt();
        System.out.print(" PIN : ");
        int pin = scanner.nextInt();

        if (this.id == id && this.pin == pin) {
            loginMeniu();
        } else {
            System.out.println(" ID or PIN number are wrong , please try again ");
            logIn();
        }
    }

    public void loginMeniu() {

        System.out.println(" ");
        System.out.println(" ** Choose your option **");
        System.out.println(" ");
        System.out.println("1)Withdrawal ");
        System.out.println("2)Check balance ");
        System.out.println("3)Depozit ");
        System.out.println("4)Change pin number ");
        System.out.println("5)Exit to login ");
        System.out.println("6)Exit");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print(" INPUT : ");
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                withdrawal();
            case 2:
                checkBalance();
            case 3:
                depozit();
            case 4:
                changePin();
            case 5:
                logIn();
            case 6:
                exit();

        }

    }

    public void withdrawal() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("How much money would you like to withdrawal ?");
        System.out.println(" ");
        System.out.print(" INPUT : ");
        int withdrawalBalance = scanner.nextInt();
        this.balance = this.balance - withdrawalBalance;
        System.out.println(" Your new balance is " + NumberFormat.getInstance(Locale.US).format(this.balance) + "$");
        loginMeniu();

    }

    public void checkBalance() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" Your balance is " + NumberFormat.getInstance(Locale.US).format(this.balance) + "$");
        System.out.println(" Do you want to make another opertion ?(yes/no)");
        System.out.println(" ");
        System.out.print(" INPUT : ");
        String action = scanner.next();
        if (action.equals("yes")) {
            loginMeniu();
        } else {
            exit();
        }

    }

    public void depozit() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" How much money would you like to depozit ? ");
        System.out.println(" ");
        System.out.print(" INPUT :");
        int depozitBalance = scanner.nextInt();
        this.balance = this.balance + depozitBalance;
        System.out.println(" Your new balance is " + NumberFormat.getInstance(Locale.US).format(this.balance) + "$");
        loginMeniu();

    }

    public void changePin() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Please insert your old pin");
        System.out.println(" ");
        System.out.print("OLD PIN : ");
        int oldPin = scanner.nextInt();
        if (oldPin == this.pin) {
            System.out.print("New Pin : ");
            int newPin = scanner.nextInt();
            System.out.print("New pin : ");
            int newPin2 = scanner.nextInt();
            if (newPin == newPin2) {
                this.pin = newPin;
                System.out.println(" ");
                System.out.println(" You changed your pin number , please login ");
            } else {
                System.out.println(" ");
                System.out.println(" The new pin does not match");
            }

        } else {
            System.out.println(" ");
            System.out.println("Your old pin is wrong");
        }

    }

    public void exit() {
        System.out.println(" ");
        System.out.println("Thank you for using our services , have a good day");
    }
}