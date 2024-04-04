package Jobsheet6;

import java.util.List;

public class pencarianBuku {
    Buku listBk[] = new Buku[5];
    int idx;

    //pencarianBuku(){
        // listBk[0]=new Buku("111", 2019, 5, "Algoritma", "Wahyuni");
        // listBk[1]=new Buku("123", 2020, 3, "Design UI", "Bambang");
        // listBk[2]=new Buku("125", 20221, 3, "Matematika", "Rizal");
        // listBk[3]=new Buku("126", 2022, 2, "IPA", "Sri");
        // listBk[4]=new Buku("127", 2023, 2, "IPS", "Roni");
    //}

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

    public int FindSeqSearch(String cari){ // Changed parameter type to String
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) { // Changed comparison to String.equals()
                posisi=i;
                break;
            }else if (!listBk[i].kodeBuku.equals(cari)) { // Changed comparison to String.equals()
                posisi--;
            }
        }
        return posisi;
    }

    public Buku FindBuku(String cari){ // Changed parameter type to String
        int posisi = FindSeqSearch(cari);
        if (posisi>-1) {
            return listBk[posisi];
        }else {
            System.out.println("data : "+cari+" tidak ditemukan");
            return null;
        }
    }

    public void tampilPosisi(String x, int pos){ // Changed parameter type to String
        if (pos>-1) {
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        }else {
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos){ // Changed parameter type to String
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

    public int findBinarySearch(String cari, int left, int right){ // Changed parameter type to String
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari.equals(listBk[mid].kodeBuku)) { // Changed comparison to String.equals()
                return(mid);
            } else if (listBk[mid].kodeBuku.compareTo(cari) < 0) { // Changed comparison to String.compareTo()
                return findBinarySearch(cari, mid + 1, right);
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) { // Changed comparison to String.compareTo()
                return findBinarySearch(cari, left, mid -1);
            }
        }
        return -1;
    }
}
