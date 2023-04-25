package day08_StringManipulation;

import java.util.Scanner;

public class C04_stringManipulationsSoru {
    public static void main(String[] args) {

        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir mail giriniz");

        String email= scanner.next();

        // eger testlerin
        /*
        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        }
        if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }
        if (!email.contains("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }

         */

        if (!email.contains("@")){
            System.out.println("Gecersiz mail");

        } else if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");

        } else if (!email.contains("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }








    }
}
