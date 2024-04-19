package Jobsheet7;

public class Gudang26 {
    Barang26[] tumpukan;
    int size, top;

    public Gudang26(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang26[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean cekPenuh(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang26 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+brg.nama+" berhasil ditambahkan ke gudang");
        }else {
            System.out.println("Gagal! tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang26 ambilBarang(){
        if (!cekKosong()) {
            Barang26 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari gudang");
            System.out.println("kode unik dalam biner: "+ konversiBiner(delete.kode));
            return delete;
        }else {
            System.out.println("tumpukan barang kosong");
            return null;
        }
    }

    public Barang26 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang26 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas "+barangTeratas.nama);
            return barangTeratas;
        }else {
            System.out.println("tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else {
            System.out.println("tumpukan barang kosong");
        }
    }

    public String konversiBiner(int kode){
        StackKonversi26 stack = new StackKonversi26();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode/2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang26 lihatBarangTerbawah(){
        if (!cekKosong()) {
            Barang26 barangTeratas = tumpukan[0];
            System.out.println("Barang terbawah "+barangTeratas.nama);
            return barangTeratas;
        }else {
            System.out.println("tumpukan barang kosong");
            return null;
        }
    }

    public String FindSeqSearchByNama(String cari){ 
        if (!cekKosong()) {
            for (int i = 0; i < tumpukan.length; i++) {
                if (tumpukan[i].nama.equals(cari)) { 
                    return tumpukan[i].nama;
                }
                if (String.valueOf(tumpukan[i].kode).equals(cari)) { 
                    return String.valueOf(tumpukan[i].kode);
                }
            }
        }
        System.out.println("produk tidak ditemukan");
        return null;
    }
}
