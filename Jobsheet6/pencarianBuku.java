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

    public int FindSeqSearch(String cari){ 
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) { 
                posisi=i;
                break;
            }else if (!listBk[i].kodeBuku.equals(cari)) { 
                posisi--;
            }
        }
        return posisi;
    }

    public Buku FindBuku(String cari){ 
        int posisi = FindSeqSearch(cari);
        if (posisi>-1) {
            return listBk[posisi];
        }else {
            System.out.println("data : "+cari+" tidak ditemukan");
            return null;
        }
    }

    public void tampilPosisi(String x, int pos){ 
        if (pos>-1) {
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        }else {
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos){ 
        if (pos>-1) {
            System.out.println("Kode buku \t: "+listBk[pos].kodeBuku);
            System.out.println("Judul Buku \t: "+listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: "+listBk[pos].Pengarang);
            System.out.println("Stock \t: "+listBk[pos].stock);
        }else {
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }

    public int findBinarySearch(String cari, int left, int right){ 
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari.equals(listBk[mid].kodeBuku)) { 
                return(mid);
            } else if (listBk[mid].kodeBuku.compareTo(cari) < 0) { 
                return findBinarySearch(cari, mid + 1, right);
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) { 
                return findBinarySearch(cari, left, mid -1);
            }
        }
        return -1;
    }

    public int FindSeqSearchByJudul(String cari){ 
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equals(cari)) { 
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearchByJudul(String cari, int left, int right){ 
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari.equals(listBk[mid].judulBuku)) { 
                return(mid);
            } else if (listBk[mid].judulBuku.compareTo(cari) < 0) {
                return FindBinarySearchByJudul(cari, mid + 1, right);
            } else if (listBk[mid].judulBuku.compareTo(cari) > 0) {
                return FindBinarySearchByJudul(cari, left, mid - 1);   
            }
        }
        return -1;
    }

    public void bubbleSortByJudul() {
        int n = listBk.length;
        Buku temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[j+1].judulBuku) > 0) {
                    temp = listBk[j];
                    listBk[j] = listBk[j+1];
                    listBk[j+1] = temp;
                }
            }
        }
    }
}
