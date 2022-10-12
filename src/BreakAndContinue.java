import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        /*
        break and continue ;

        break anahtar kelimesi :
        (sonlandırmak)
            *döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığında
            çalışmasını durdurur.
            *böylece döngü hiçbir koşula bağlı olmadan durdurulmuş olur
            *break ifadesi SADECE VE SADECE içinde bulunduğu döngüyü sonlandırır
            *eğer iç içe döngüler varsa ve içteki döngüde break kullanılmışsa sadece
            içteki döngü sona erer
            *koşulumuz doğru olsa bile döngüden çıkar

        continue anahtar kelimesi :
        (devam etmek)
            *döngü herhangi bir yerde yada herhangi bir zamanda continue ifadesiyle karşılaştığı
            geri kalan işlemlerini yapmadan direkt döngü başına döner
            *sonsuz döngüye yol açabilir

         */

        int a = 0;
        while(a < 20) {
            if(a == 10) {
                break;
            }
            System.out.println("a : " + a);
            a++;
        }

        //değeri kullanıcıdan while içinde almasının nedeni, değeri 1 olarak girerseniz bir daha true döngüsü içinden çıkamaz

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter num : ");
            int num = scanner.nextInt();
            if(num == -1) {
                System.out.println("Program failed..");
                break;
            }
            System.out.println("Num : " + num);
        }

        for(int b = 0; b <10 ; b++) {
            if(b == 3 || b == 5) {
                continue;
            }
            System.out.println("b : " + b);
        }

        int c = 0;
        while (c <10) {
            if(c == 3 || c == 5) {
                c++;
                continue;    //sonsuz döngüye yol açar
            }
            System.out.println("c : " + c);
            c++;
        }

        //while içerisinde arttırma işlemleri döngü dışında yapılması nedeniyle sıkıntı yaratır
    }
}
