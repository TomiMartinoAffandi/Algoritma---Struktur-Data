package Jobsheet7;

import java.util.Scanner;
public class utama26 {
    public static void main(String[] args) {
        Gudang26 gudang = new Gudang26(7);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu  ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. tampilkan tumpukan barang");
            System.out.println("4. keluar");
            System.out.print("pilih operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Masukan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukan kategori barang");
                    String kategori = sc.nextLine();
                    Barang26 barangBaru = new Barang26(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
            
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
