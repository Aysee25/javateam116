package day05_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseStatemnets {
    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bır karakter gırınız");

        char karakter=scanner.next().charAt(0);

        if ('A' <= karakter && karakter<='Z'){
            System.out.println("Girilen karakter buyuk harf");
        } else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

    }
}
