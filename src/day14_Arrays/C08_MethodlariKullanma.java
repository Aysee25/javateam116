package day14_Arrays;

import day13_arrays.C05_ArraydekiEnBuyukSayiyiBulma;
import day13_arrays.C07_TumElemanlariArttir;

import java.util.Arrays;

public class C08_MethodlariKullanma {
    public static void main(String[] args) {

        int [] sayiArray = {2,2,7,4,2,4,5,7,3};
        // Bir arrayin bütün elemanlarina 2 ekleyin
        System.out.println(Arrays.toString(sayiArray)); // [2, 2, 7, 4, 2, 4, 5, 7, 3]


        sayiArray=C07_TumElemanlariArttir.tumElemanlariArtir(sayiArray,2);
        System.out.println(Arrays.toString(sayiArray)); // [4, 4, 9, 6, 4, 6, 7, 9, 5]

        C03_EnBuyukEnKucukElemanYazdirma.enBuyukEnkucukElemanYazdirma(sayiArray); // Array'deki elementlerin toplami : 54
        int enBuyukSayi = C05_ArraydekiEnBuyukSayiyiBulma.enBuyukSayi(sayiArray);

        System.out.println(enBuyukSayi); // System.out.println(Arrays.toString(sayiArray));


    }
}
