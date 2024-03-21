import java.util.Scanner;
public class Aksesoris26main {
    public static void main(String[] args) {
        Aksesoris26 [] aksArray = new Aksesoris26[5];
        Scanner sc = new Scanner(System.in);
        
        aksArray[0] = new Aksesoris26("Gelang", "Perhiasan", 10000, 10);
        aksArray[1] = new Aksesoris26("Anting Emas", "Perhiasan", 100000, 3);
        aksArray[2] = new Aksesoris26("Anting Biasa", "Perhiasan", 5000, 5);
        aksArray[3] = new Aksesoris26("Kalung Emas", "Perhiasan", 200000, 10);
        aksArray[4] = new Aksesoris26("Kalung Biasa", "Perhiasan", 20000, 15);
        
        for (int i = 0; i < aksArray.length; i++) {
            aksArray[i].tampil();
            System.out.println("Penghasilan Aksesoris ke-"+ i + ": " +aksArray[i].hitungTotalPenjualan());
            // aksArray[i].cariAksesorisTermurah(aksArray[i]);
        }
        sc.close();
    }
}
