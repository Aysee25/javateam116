package day05_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bır harf gırınız");

        char karakter=scanner.next().charAt(0);

        if ('a' <= karakter && karakter<='z'){
            System.out.println("Girilen harfin yeni hali :" + Character.toUpperCase(karakter));
        } else {
            System.out.println("Girilen karakter :" + karakter);
        }









    }
}
