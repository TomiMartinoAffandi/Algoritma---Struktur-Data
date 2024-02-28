package JobSheet3;
public class ContohOverloadingKonstruktor {

    public String nama;
    public int umur;

    public ContohOverloadingKonstruktor() {
    }

    public ContohOverloadingKonstruktor(String nama) {
        this.nama = nama;
    }

    public ContohOverloadingKonstruktor(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

