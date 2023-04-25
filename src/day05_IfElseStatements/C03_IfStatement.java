package day05_IfElseStatements;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bır tamsayı gırınız");

        int girilenSayi= scanner.nextInt();
        if (girilenSayi % 3 == 0) System.out.println("uc ıle bolunebılen sayı");
        if (girilenSayi % 5 == 0) System.out.println("bes ılr bolunebılen sayı");




    }
}
