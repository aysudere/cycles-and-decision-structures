import java.util.Scanner;

public class WhileATMprogram {
    public static void main(String[] args) {
        /*
        while döngüsü yardımıyla bir tane ATM programı yazmaya çalışın

        işlemler :
        1.işlem : bakiye öğrenme
        2.işlem : para çekme
        3. işlem : para yatırma
        q : çıkış
         */

        Scanner scanner = new Scanner(System.in);
        int amount = 500;

        while (true) {
            System.out.println("Please enter your operation : " +
                    "1.Learn Balance" +
                    " 2.Getting Money" +
                    " 3.Deposit" +
                    " 4.Quit");
            int op = scanner.nextInt();
            if(op == 1) {
                System.out.println("Your balance : " + amount);
            }
            else if(op == 2) {
                System.out.println("Please enter the amount you want to withdraw : ");
                int withdraw = scanner.nextInt();

                if(withdraw > amount) {
                    System.out.println("Insufficient limit");
                }
                else {
                    amount -= withdraw;
                    System.out.println("Your balance now : " + amount);
                }
            }
            else if (op == 3) {
                System.out.println("Please enter the amount you want to deposit : ");
                int deposit = scanner.nextInt();
                amount += deposit;
                System.out.println("Your balance now : " + amount);
            }
            else if (op == 4) {
                System.out.println("You logged out");
                break;
            }
            else {
                System.out.println("You typed wrong");

            }
        }

    }
}
