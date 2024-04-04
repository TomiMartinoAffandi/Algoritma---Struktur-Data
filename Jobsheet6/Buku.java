package Jobsheet6;

public class Buku {
    String kodeBuku; // Changed type to String
    int tahunTerbit, stock;
    String judulBuku, Pengarang;
    int idx;

    pencarianBuku dataBuku[] = new pencarianBuku[5];

    public Buku(){

    }

    public Buku(String kodeBuku, int tahunTerbit, int stock, String judulBuku, String Pengarang){ // Changed parameter type to String
        this.kodeBuku = kodeBuku;
        this.tahunTerbit = tahunTerbit;
        this.stock = stock;
        this.judulBuku = judulBuku;
        this.Pengarang = Pengarang;
    }

    public void tampilBuku(){
        System.out.println("==========================");
        System.out.println("Kode Buku: "+kodeBuku);
        System.out.println("Judul Buku: "+judulBuku);
        System.out.println("Tahun Terbit: "+tahunTerbit);
        System.out.println("Pengarang: "+Pengarang);
        System.out.println("Stock: "+stock);
    }
}
