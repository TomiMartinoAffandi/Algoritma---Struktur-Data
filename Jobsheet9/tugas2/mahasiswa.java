package Jobsheet9.tugas2;

public class mahasiswa {
    int nim;
    String nama;

    public mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String toString() {
        return "Mhs(nim=" + nim + ", nama=" + nama +')';
    }
}
