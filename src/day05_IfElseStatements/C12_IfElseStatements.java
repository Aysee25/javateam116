package day05_IfElseStatements;

import java.util.Scanner;

public class C12_IfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        // hem 3 hem 5'e bolunuyorsa SUPER yazdirin
        // İkisine de bolunebılen sayılar ıcın YAZIK yazdırın


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bır tamsayı gırınız");

        int girilenSayi=scanner.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0) {
            System.out.println("SUPER");
        } else if (girilenSayi % 3 == 0) {
            System.out.println("Uc ile bolunebilen sayi");
        } else if (girilenSayi % 5== 0) {
            System.out.println("5 ile bolunebılen sayi");
        }else {
            System.out.println("YAZIK");
        }
    }
}
