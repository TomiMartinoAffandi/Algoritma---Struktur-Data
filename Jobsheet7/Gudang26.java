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
}
