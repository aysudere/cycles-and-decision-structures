import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        /*
        for (başlatma ; koşul ; arttırma veya azaltma işlemleri
            {
                döngü koşulumuz doğru olduğu sürece burası çalışacak
            }

        for : üç tane alan
            döngü değişkeninin ilk değeri : başlatma
            true olduğu sürece döngü bloğu sürekli olarak çalışır : koşul
            döngü bitince döngü değişkeni azaltma yada arttırma işlemleri : döngü bloğu SONA ERDİĞİNDE ÇALIŞIR
         */


        int a;
        for(a = 0 ; a <5 ; a ++) {
            //i = 0 'dan başlar, 5'ten küçük olana kadar artar
            System.out.println("a = " + a);

            /*
            i değeri 5 olduğunda, döngü false olur ve döngü durur
            en başa döndüğünde arttırma yada azaltma işlemlerini yapar
            koşullar false olduğunda döngü durur
             */
        }

        for(int b = 0; b < 5; b ++) {
            //değer döngünün içinde de oluşturulabilir
            System.out.println("b : " + b);
        }

        for(int c = 10;  c >= 0 ; c --) {
            //değer azaltılabilir
            System.out.println("c = " + c);
        }

        int d = 0;
        for(; d < 5; d ++) {
            // tanımlama daha önce yapıldığı için, parantez içinde yapılmayabilir. böylece ; işareti kullanılır
            System.out.println("Learning Java");
            //5 defa yazılmış olur
        }

        int e = 0;
        int f = 10;
        for(; e < 10 && f > 0 ; e ++ , f--) {
            System.out.print(" e : " + e);
            System.out.print(" f : " + f);
        }

        for(int g = 2 ; g <100 ; g *= 2) {
            System.out.println("g : " + g);
        }

        /*
        Faktöriyel
        kullanıcdan alına 5 değeri : 5.4.3.2.1
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        int total = 1;
        for(int i = 1; i <= number ; i ++) {
            total *= i;
            System.out.println("Factorial 1 : " + total);
        }

        int total1 = 1;
        for(; number > 0; number--) {
            total1 *= number;
            System.out.println("Factorial 2 : " + total1);
        }


        /*
        mantıken 5. 4. 3. 2. 1
        ancak
        bilgisayar işlemleri teker teker yapar
        5.4 20
        20.3 60
        60.2 120
        120.1 120
         */


    }
}
