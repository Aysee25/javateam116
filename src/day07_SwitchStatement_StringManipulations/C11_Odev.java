package day07_SwitchStatement_StringManipulations;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        // Kullanicidan 2 basamakli bir sayi alip,
        // girilen sayiyi yazi ile yazdirin



        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen iki basamaklı bir tamsayı giriniz");

        int sayi=scanner.nextInt();

        switch (sayi){
            case 11 :
                System.out.println("On Bir");
                break;
            case 12 :
                System.out.println("On Iki");
                break;
            case 13 :
                System.out.println("On Uc");
                break;
            case 14 :
                System.out.println("On Dort");
                break;
            case 5 :
                System.out.println("Bes");
                break;
            case 6 :
                System.out.println("Alti");
                break;
            case 7 :
                System.out.println("Yedi");
                break;
            case 8 :
                System.out.println("Sekiz");
                break;
            case 9 :
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Gecersiz Rakam");

        }






    }
}
