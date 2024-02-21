package JobSheet2;
public class buku27 {
    String judul, pengarang;
    int halaman, stok, harga;

    public buku27(){

    }

    public buku27(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("judul: "+judul);
        System.out.println("pengarang: "+pengarang);
        System.out.println("jumlah halaman: "+halaman);
        System.out.println("sisa stok: "+stok);
        System.out.println("Harga Rp: "+harga);
    }

    void terjual(int jml){
        if (stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
    
    
}