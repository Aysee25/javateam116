package day13_arrays;

public class C09_ElemanlariKaydirma {

    // Verilen bir array’deki tum elementleri bir saga kaydirip,
    // sondaki elementi de basa tasiyacak bir method olusturun,
    // array’i yeni haliyle kaydedin.
    //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

    public static void main(String[] args) {
        int[] input= {4,5,6,7};
solaKaydirma(input);


    }

    public  static void solaKaydirma(int[] arr){
        int temp = arr[arr.length-1];
        for (int i=arr.length-1; i>0; i--){
            arr[i] =arr[i-1];
        }
        arr[0] =temp;
        System.out.println(temp);
    }

}
