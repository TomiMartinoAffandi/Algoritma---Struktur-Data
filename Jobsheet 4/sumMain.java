import java.util.Scanner;
public class sumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pemisah = "==========================================================================";
        System.out.println(pemisah);
        System.out.println();
        System.out.println("Program menghitung keuntungan total(Satuan Juta. misal 5.9)");
        System.out.print("Masukan jumlah bulan: ");
        int elm = sc.nextInt();

        sum sm = new sum(elm);
        System.out.println(pemisah);
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukan untung bulan ke-"+(i+1)+"= ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println(pemisah);
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+"bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println(pemisah);
        System.out.println("Algortima Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+"bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
