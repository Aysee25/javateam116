package day05_IfElseStatements;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yazdırmak ıstedıgınız ayın ılk harfını gırınız");

        char IlkHarf=scanner.next().charAt(0);

        if (IlkHarf=='o' || IlkHarf == 'O')System.out.println("Ocak");
        if (IlkHarf=='S') System.out.println("Subat");
        if (IlkHarf=='M')System.out.println("Mart veya Mayıs");
        if (IlkHarf=='N')System.out.println("Nisan");
        if (IlkHarf=='H')System.out.println("Haziran");
        if (IlkHarf=='T')System.out.println("Temmuz");
        if (IlkHarf=='A')System.out.println("Agustos");
        if (IlkHarf=='E')System.out.println("Eylul");
        if (IlkHarf=='K')System.out.println("Kasım");







    }
}
