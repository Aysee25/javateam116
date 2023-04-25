package day13_arrays;

public class C06_EnUzunEnKısaKelime {
    public static void main(String[] args) {

        // verilen String bir array'de en uzun ve en kısa kelimeleri yazdıran metod olusturun

        String[] arr= {"Saida","Isa","Asil","Kubra","Elif","Yusuf"};


    enUzunveEnKisaElemanlar(arr);


    }


    public static void enUzunveEnKisaElemanlar(String[] arr){

        String enKisaEleman=arr[0];
        String enUzunEleman=arr[0];

        // >= koydugumuzda sonuna kadar kod calısacagı ıcın en sondakı en uzun kelımeyı alır.

        for (int i=0; i < arr.length; i++){
            if (arr[i].length() >= enUzunEleman.length()){
                enKisaEleman=arr[i];
            }
            if (arr[i].length() < enKisaEleman.length()){

            }
        }
        System.out.println("En uzun Kelime :" + enUzunEleman );
        System.out.println("En kisa kelime :" + enKisaEleman );
    }

}
