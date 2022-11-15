package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi;
        int bakiye=1000;
        int ücret;
        System.out.println("1: para yükle");
        System.out.println("2: para çek");
        System.out.println("3: para transferi yap");
        System.out.println("4: işlemi sonlandırın");
        System.out.println("5: kartı iptal edin");
        Scanner scan = new Scanner(System.in);
        System.out.println("yapacaginiz islem numarasini giriniz: ");
        sayi = scan.nextInt();
        switch(sayi){

            case 1:
                System.out.println("yüklenecek para miktarı: ");
                ücret = scan.nextInt();
                bakiye = bakiye+ücret;
                System.out.println("hesabınıza " + ücret + "tl yüklendi");
                System.out.println("yeni bakiye: " + bakiye+" tl");
                break;
            case 2:
                System.out.println("cekilecek para miktari: ");
                ücret = scan.nextInt();
                bakiye -= ücret;
                System.out.println("hesabınızdan " + ücret + "tl cekildi");
                System.out.println("yeni bakiye: " + bakiye +" tl");
                break;
            case 3:
                System.out.println("para transferi yapılacak kisi: ");
                String isim = scan.nextLine();
                System.out.println("para miktarı: ");
                ücret = scan.nextInt();
                System.out.println(isim + "isimli kişiye "  + ücret+" tutarında para gonderildi");
                break;
            case 4:
                System.out.println("işlem sonlandırıldı" );
                break;
            case 5:
                System.out.println("kart iptal edildi");
                break;
            default:
                System.out.println("gecersiz işlem girildi");
        }
    }
}
