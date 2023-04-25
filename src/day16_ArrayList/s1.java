package day16_ArrayList;

import java.util.Arrays;

public class s1 {

    // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
    //method yaziniz.

    public static void main(String[] args) {

        int[] arr = {3,5,7,2,1,9};

        toplamSonuc(arr);


    }
    public static int[] toplamSonuc(int[] arr){
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];


        }
        System.out.println(toplam);
       return arr;
    }


}

