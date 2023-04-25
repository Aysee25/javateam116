package day14_Arrays;

import java.util.Arrays;

public class C02_ArraysElemanlariSagaKaydirma {
    public static void main(String[] args) {

        // Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        // 1) sondaki elemani gecici bir yere kaydet
        // 2) elemanlari saga kaydir
        // 3) son elamni basa koy

        int[] input ={4,5,6,7};
        System.out.println(Arrays.toString(input));

        // elemanlariSagaKaydir(input); // metodu cagırma ilk hali

       input=elemanlariSagaKaydir(input); // metodu kullanmaya cagırdık

        System.out.println(Arrays.toString(input));


    }
    // metodun(makinenin) kendisi
    public static int[] elemanlariSagaKaydir(int[] input){
        // [4,5,6,7]

        // 1) array'in son elamanini kaydet.Lenght kullanarak dinamik yapi

        int gecici=input[input.length-1];

        // 2) dinamik olarak elemanlari saga kaydir

        for (int i=input.length-2; i>=0; i--){
            input[i+1]=input[i];

        }
        // 3) kaydedilen gecici elamani basa koy
        input[0]=gecici;
        return input; // // updated ( değiştirilen) array methodun cagirildigi yere dondurulur
    }
}
