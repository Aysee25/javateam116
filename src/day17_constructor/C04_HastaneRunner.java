package day17_constructor;

public class C04_HastaneRunner {
    public static void main(String[] args) {
        C03_Hastane per1= new C03_Hastane();

    /*
        Biz bir obje olusturdugumuzda java once bu constructor'un varligini teyit eder.
        Constructor varsa istenen objeyi olusturur.
        Obje olusturulunca instance olan butun variable'larin birer kopyalarini olusturur
        ve bu objeye iliskilendirir
        Objeye yeni bir atama yapmadigimiz muddetce
        objenin olusturuldugu class'daki ilk degerleri kullanir.

        obje uzerinden static variable'lara ulasmak istedigimizde
        java once obje'ye gider, o objeye ilisiklendirilen bilgilerde
        istenen variable'i bulamazsa, class seviyesinde static variable'lara ulasir

        static variable'lar class'a baglidir
        ve degistirilirse tum objeler icin degisiklik gecerli olur

         */

        System.out.println(per1.personelIsmi); // Isim belirtilmedi
        per1.personelIsmi="Doktor";
        System.out.println(per1.maas("Doktor")); //5000


        C03_Hastane per2=new C03_Hastane();
        System.out.println(per2.personelTuru); // Personel turu belirtilmedi

        System.out.println(per1.hastaneAdi); // Yildiz Hastanesi
        per2.hastaneAdi="Java Hastanesi";
        System.out.println(per1.hastaneAdi); // Java Hastanesi


    }



}
