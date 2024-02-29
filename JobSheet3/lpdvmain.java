package JobSheet3;
import java.util.Scanner;
public class lpdvmain {
    public static void main(String[] args) {
        String sep = "================================================";
        Scanner sc = new Scanner(System.in);
        luaspermukaandanvolume lpdv = new luaspermukaandanvolume();
        
        // for (int i = 0; i < 1; i++) {
            lpdv = new luaspermukaandanvolume();
            System.out.print("Masukan jari - jari:  ");
            lpdv.r = sc.nextDouble();
            System.out.print("Masukan sisi miring: ");
            lpdv.s = sc.nextDouble();
            System.out.print("Masukan panjang: ");
            lpdv.panjang  = sc.nextDouble();
            System.out.print("Masukan tinggi: ");
            lpdv.tinggi  = sc.nextDouble();

            System.out.println(sep);
            System.out.println(String.format("%26s", "KERUCUT"));
            System.out.println(sep);
            
            System.out.println("luas permukaan kerucut: "+ lpdv.luasPermukaanKerucut());
            System.out.println("volume kerucut: "+ lpdv.volumeKerucut());
            System.out.println(sep);
            System.out.println(String.format("%30s", "LIMAS SEGI EMPAT"));
            System.out.println(sep);
            System.out.println("luas permukaan limas segi empat: "+ lpdv.luasPermukaanlimasSegiEmpat());
            System.out.println("volume limas segiempat: "+ lpdv.volumeLimasSegiEmpat());
            System.out.println(sep);
            System.out.println(String.format("%24s", "BOLA"));
            System.out.println(sep);
            System.out.println("luas permukaan bola: "+ lpdv.luasPermukaanBola());
            System.out.println("volume bola: "+ lpdv.volumeBola());
            
        //}
    }

    
}
