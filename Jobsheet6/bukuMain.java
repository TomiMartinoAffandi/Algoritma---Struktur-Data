package Jobsheet6;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class bukuMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianBuku data = new pencarianBuku();
        int jumBuku = 5;

        System.out.println("----------------------------------------");
        System.out.println("Masukan data buku sacara urut dari kode buku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
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
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
