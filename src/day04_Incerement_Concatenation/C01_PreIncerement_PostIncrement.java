package day04_Incerement_Concatenation;

import java.util.Scanner;

public class C01_PreIncerement_PostIncrement {

    public static void main(String[] args) {

        // kullanıcıdan bır tamsayı ısteyın
        // gırılen tamsayıyı yazdırın
        // sonra 1 arttırın


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayı giriniz");
        int girilenSayi= scanner.nextInt();

        System.out.println("Girilen sayi : " + girilenSayi);

        girilenSayi++;

        // kullanıcıdan bır sayı daha alın
        // bu sayıyı once arttırın
        // sonra yazdırın

        System.out.println("Lutfen bir tamsayi daha girin");
        int girilenSayi2= scanner.nextInt();

        girilenSayi2++;

        System.out.println("Girilen sayi : " + girilenSayi2);

        System.out.println("Kodun sonunda GS : " + girilenSayi + ", GS2 : " + girilenSayi2);












    }

}
