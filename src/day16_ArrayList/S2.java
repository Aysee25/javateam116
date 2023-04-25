package day16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class S2 {
    //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
    //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,2,1,9,3,5,9};

            List<Integer> yeniMukerrer=mukerrer(arr);
        System.out.println(yeniMukerrer);


    }

    public static List<Integer>mukerrer(int[]arr){

        List<Integer> tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizListe.contains(arr[i])){

                tekrarsizListe.add(arr[i]);
            }


        }
        return tekrarsizListe;

    }







}
