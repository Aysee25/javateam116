package day10_nestedForLoop_MethodOlusturma;

public class C05_nestedForLoop {
    public static void main(String[] args) {

          /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5;

        *
        * *
        * * *
        * * * *
        * * * * *

     */

            int sayi =4;

            for (int i = 1; i <=sayi ; i++) { // outer ==> satirlar
                for (int j = 1; j <=i ; j++) { // inner ==> sutunlar

                    System.out.print("* ");
                }
                System.out.println("");
            }
  /*
        verilen sayi icin asagidaki sekli olusturun
        int sayi = 5;

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
     */







        }
}