import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        /*
        while (döngü koşulu) {
            döngü doğru olduğu sürece çalışr
            }

            yapı, fordan farklıdır
            döngü değişkeni kullanılacaksa, while döngüsüne gelmeden başlatılmalıdır
            döngü koşulu yazılmalı
            döngü koşulu true olduğu sürece devam eder
            döngü değişkeni nerede arttırılır?

            for: döngü BLOĞU BİTTİĞİNDE döngü değişkeni artar
            ancak while : programcı yapmalıdır

         */

        for(int a = 0; a < 10; a++) {
            System.out.println(a);
        }

        int b = 0; // döngü değişkeni başlar
        while( b < 10) { //b 10dan küçük olduğu sürece çalışır
            System.out.println("result 1 : " + b);
            b++;
        }

        int c = 10;
        while(c < 100) {
            System.out.println("result 2 : " + c);
            c += 10;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int number = scanner.nextInt();

        int total = 1;
        while (number > 0) {
            total *= number;
            number--;
        }
        System.out.println("Total : "+ total);

        /*
        sonsuz döngü : koşulun bitmemesi
                       sürekli true dönmesi
                       genelde while döngülerinde başımıza gelir
         */
    }
}
