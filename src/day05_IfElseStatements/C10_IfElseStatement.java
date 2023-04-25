package day05_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseStatement {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu gırınız");

        double not=scanner.nextDouble();

        if (not<0 || not>100) {
            System.out.println("Gecersiz not");
        } else if (not>=85) {
            System.out.println(" Notunuz AA");
        } else if (not>=65) {
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Notunuz DD Kaldınız");
        }
            



    }
}
