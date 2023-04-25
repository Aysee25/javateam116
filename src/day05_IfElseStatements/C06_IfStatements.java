package day05_IfElseStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan notunu alin
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Gırın");

        double not= scanner.nextDouble();

        if (not >= 50)System.out.println("Sınıfı Gectin");

        if (not<50)System.out.println("Maalesef Kaldın");


        /*
        Oncekı sorulardan farklı olarak bu soruda ıkı if birbirine bagımlıdır
        iki if'den sadece 1'i calısır
        ikisinin birden calısmama ihtimali yoktur
         */

        if (not >= 50) {
            System.out.println("Sınıfı Gectin");
        } else {
            System.out.println("Maalesef Kaldın");
        }





    }
}
