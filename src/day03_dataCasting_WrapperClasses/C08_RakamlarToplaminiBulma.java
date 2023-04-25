package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C08_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullanıcıdan 3 basamaklı pozıtıf bır tamsayı alıp
        // sayıların rakamlar toplamınu yazdırın
        // ornegın 213 gırıldıgınde 6 yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamaklı bır tamsayı giriniz");

        int sayi= scanner.nextInt();
        int birlerBas =0;
        int rakamlarToplami =0;

         birlerBas = sayi % 10;

         rakamlarToplami = rakamlarToplami + birlerBas; //

         // sayi 213 birlerBasamagi =3 rakamlar toplamı = 3

        sayi = sayi / 10; //  213/10== 1

        birlerBas = sayi %10; // 21%10 === 1

        rakamlarToplami = rakamlarToplami + birlerBas; // 3 +1 = 4

        sayi = sayi /10; // 21/10 === 2

        birlerBas = sayi % 10; // 21/10 === 2

        rakamlarToplami = rakamlarToplami + birlerBas; // 4 + 2 = 6


        System.out.println("Girilen sayinin rakamlar taoplami :" + rakamlarToplami);


    }
}
