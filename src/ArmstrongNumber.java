import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
        girilen sayının armstrong sayısı olup olmadığını bulmaya çalışın
        örneğin 4 basamaklı bir sayının armstrong sayısı olması için
        1634 = 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4
        371 = 3 ^ 3 + 7 ^ 3 + 1 ^ 3
        while döngüsüyle yapabilirsiniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num = scanner.nextInt();

        System.out.println("Please enter number of digits : ");
        int dig = scanner.nextInt();

        int gecici = num;
        int sum = 0;

        do {
            int step =gecici % 10;
            gecici /= 10;

            sum += Math.pow(step, dig);

        }while (gecici > 0);

        if (num == sum) {
            System.out.println("This number is Armstrong num");
        }
        else {
            System.out.println("It is not Armstrong num");
        }
    }
}
