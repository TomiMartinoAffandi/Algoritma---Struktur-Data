
public class Aksesoris26 {
    String nama26;
    String kategori26;
    int harga26;
    int terjual26;
    
    public Aksesoris26(){

    }

    public Aksesoris26(String nama,String kategori,int harga,int terjual){
        this.nama26 = nama;
        this.kategori26 = kategori;
        this.harga26 = harga;
        this.terjual26 = terjual;
    }

    public void tampil(){
        System.out.print("Nama Aksesoris: "+nama26+"\n");
        System.out.print("Kategori: "+kategori26+"\n");
        System.out.print("Harga: "+harga26+"\n");
        System.out.print("Terjual: "+terjual26+"\n");
        
    }

    public int hitungTotalPenjualan(){
        int totalPenjualan;
        return totalPenjualan = harga26*terjual26;
    }

    public void cariAksesorisTermurah(int[] hargaTerendah){
        key = 5000
        hargaTerendah;
        if (hargaTerendah == key) {
            tampil();
        }
    }

    public void daftarAksesoris(){
        
    }
}