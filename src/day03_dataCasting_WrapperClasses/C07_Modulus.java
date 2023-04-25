package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {

        System.out.println(20 % 8 ); // 4

        System.out.println( 625872538 % 3 ); // 1 eger sonuc 0 ıse sayı 3'e tam bolunur

        // 12563412 sayısı 17'nın tam katı mıdır

        System.out.println(12563412 % 17); // 4 demek ki tam kati degil

        // kullanıcidan bir pozitif tamsayı alıp
        // birler basamaginin karesini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir pozitif tamsayi giriniz");

        int girilenSayi= scanner.nextInt();

        System.out.println(girilenSayi%10 * girilenSayi%10);

        // girilen sayidan birler basamagini silip kalan sayiyi yazdirin
        // ornegin 213 girildiginde 21 yazdirin

        System.out.println(girilenSayi/10); // 213/10 === 21









    }

}
