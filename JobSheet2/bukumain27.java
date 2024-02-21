package JobSheet2;
public class bukumain27 {
    public static void main(String[] args) {
        buku27 bk1 = new buku27();  
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
    
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        buku27 bk2 = new buku27("Self reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        buku27 bukuTomi = new buku27("Hanya Pria Biasa", "Tomi Martino Affandi", 500, 100, 200000);
        bukuTomi.terjual(50);
        bukuTomi.tampilInformasi();
    }
}
