package Jobsheet6;

public class pencarianBuku {
    Buku listBk[] = new Buku[5];
    int idx;

    void tambah(Buku m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data penuh");
        }
    }

    void tampil(){
        for (Buku m : listBk) {
            m.tampilBuku();
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku==cari) {
                posisi=i;
                break;
            }else if (listBk[i].kodeBuku!=cari) {
                posisi--;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos){
        if (pos>-1) {
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        }else {
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if (pos>-1) {
            System.out.println("Kode buku \t: "+x);
            System.out.println("Judul Buku \t: "+listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: "+listBk[pos].Pengarang);
            System.out.println("Stock \t: "+listBk[pos].stock);
        }else {
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }
}
