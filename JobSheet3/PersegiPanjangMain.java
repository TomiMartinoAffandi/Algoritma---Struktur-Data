package JobSheet3;
import java.util.Scanner;
public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke: "+i);
            System.out.print("Masukan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("persegi panjang ke: "+i);
            System.out.println("panjang: "+ ppArray[i].panjang+", lebar: "+ppArray[i].lebar);
        }

    }
}
