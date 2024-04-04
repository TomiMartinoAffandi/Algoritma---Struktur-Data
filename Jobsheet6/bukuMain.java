package Jobsheet6;
import java.util.Scanner;
public class bukuMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        pencarianBuku data = new pencarianBuku();
        int jumBuku = 5;

        System.out.println("----------------------------------------");
        System.out.println("Masukan data buku sacara urut dari kode buku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s.next(); // Changed to accept String input
            System.out.print("Judul Buku \t: ");
            String judulBuku = s.next();
            System.out.print("Tahun terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s.next();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku m = new Buku(kodeBuku, tahunTerbit, stock, judulBuku, pengarang);
            data.tambah(m);
        }


        System.out.println("----------------------------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukan Kode Buku yang dicari : ");
        System.out.print("Kode Buku : ");
        String cari = s.next(); // Changed to accept String input
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        System.out.print("Cari Buku : ");
        cari = s.next(); // Changed to accept String input
        Buku dataBuku = data.FindBuku(cari);
        if (dataBuku != null) {
            dataBuku.tampilBuku();
        }
        System.out.println("=========================");
        System.out.println("Menggunakan Binary Search");
        System.out.print("masukan kode buku : ");
        cari = s.next(); // Changed to accept String input
        posisi = data.findBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
