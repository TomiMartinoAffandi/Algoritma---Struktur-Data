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

    int terjual(int jml){
        if (stok > 0) {
            stok -= jml;
        }
        return stok;
    }

    void restock(int n){
        stok += n;
    }

    int gantiHarga(int hrg){
        harga = hrg;
        return hrg;
    }

    int hitungHargaTotal(int jml){
        jml *= harga;
        return jml;
    }

    int hitungDiskon(int hrg){
        int diskon;
        if (hrg > 150000) {
            diskon = (int) (hrg * 0.12);
        }else if (hrg >= 75000) {
            diskon = (int) (hrg * 0.05);
        }else
            diskon = 0;
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon){
        return hargaTotal -= diskon;
    }
    
}