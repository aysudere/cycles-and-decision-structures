import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        /*
        Do while döngüleri :
        while döngüsüne benzer
        -do HER ZAMAN ÖNCE ÇALIŞIR
        AYRICA KOŞUL kontrol EDİLMEZ

        koşul doğru olmasa bile DO bir kere çalışır

        do {
            koşul doğru olduğu sürece
            whiledan farkı en az bir kere çalışmasının garanti olması
            }
            while(koşul);
         */

        int a = 0; //döngü değişkeni dışarı da tanımlanır
        do {
            System.out.println("a : " + a);
            a++;
        } while (a <5); //koşul kontrol etmeden bir kere çalışır

        /*
        for ve while'a göre daha az kullanılır
        ancak bazı problemlerde yararlı olabilir
         */

        //sayının rakamları toplamı : 1234 4 almak için 10'a 3 almak için 100'e

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num = scanner.nextInt();
        int sum = 0;
        do {
            sum += num % 10;
            num = num / 10;
        } while (num > 0);
        System.out.println("Total : " + sum);

    }
}
