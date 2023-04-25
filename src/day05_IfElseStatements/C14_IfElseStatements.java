package day05_IfElseStatements;

import java.util.Scanner;

public class C14_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz : \nkadın icin : K, erkek icin : E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasınızı giriniz");

        int yas= scanner.nextInt();

        if ((cinsiyet != 'K' && cinsiyet != 'E') || yas<10 || yas>80 ) {
            System.out.println("gecersiz giris");
        } else if (cinsiyet == 'K' && yas>=60) {
            System.out.println("Kadın 60 yasından buyuk, emekli olabilir");
    } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("kadın 60 yasın akadar calısmalıdır, daha" + (60-yas)+ "sen calısmalısın");
        } else if (cinsiyet == 'E' && yas>=65) {
            System.out.println("Erkek 65 yasından buyuk, emekli olabilir");
        } else if (cinsiyet == 'E' && yas<65) {
            System.out.println("kadın 66 yasın akadar calısmalıdır, daha\" + (65-yas)+ \"sen calısmalısın");
        }


    }
}
