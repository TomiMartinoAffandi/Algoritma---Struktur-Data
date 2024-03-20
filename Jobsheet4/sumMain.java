import java.util.Scanner;
public class sumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pemisah = "==========================================================================";
        int range = 0;
        System.out.println(pemisah);
        System.out.print("Masukan Jumlah Perusahaan : ");
        int jml = sc.nextInt();

        while (range < jml) {
            System.out.println(pemisah);
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta Misal 5.9)");
            System.out.println("Perusahaan ke-"+(range+1)+": ");
            range++;
            sum[] array = new sum[jml];

            for (int i = 0; i < jml; i++) {
                array[i] = new sum(jml);
            }

            System.out.print("Masukan Jumlah Bulan : ");
            int elm = sc.nextInt();

            sum sm = new sum(elm);
            System.out.println(pemisah);
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukan Untung Bulan ke-" + (i + 1) + " = ");
                sm.keuntungan[i] = sc.nextDouble();
            }

            System.out.println(pemisah);
            System.out.println("Algoritma Brute Force");
            System.out.println(
                    "Total Keuntungan Perusahaan ke-" + range + " selama " + sm.elemen + " bulan adalah = "
                            + sm.totalBF(sm.keuntungan));
            System.out.println(pemisah);
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total Keuntungan Perusahaan ke-" + range + " selama " + sm.elemen + " bulan adalah = "
                    + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        }
    }
}
