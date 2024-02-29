package JobSheet3;

public class dataMhs {
    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    public double rataRataIPK(dataMhs[] dataMahasiswa) {
        double totalIPK = 0;

        for (int i = 0; i < dataMahasiswa.length; i++) {
            totalIPK += dataMahasiswa[i].ipk;
        }

        if (dataMahasiswa.length > 0) {
            return totalIPK / dataMahasiswa.length;
        } else {
            return 0.0;
        }
    }

    public dataMhs mahasiswaTerbesarIPK(dataMhs[] dataMahasiswa) {
        if (dataMahasiswa.length == 0) {
            return null;
        }

        dataMhs terbesar = dataMahasiswa[0];

        for (int i = 1; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i].ipk > terbesar.ipk) {
                terbesar = dataMahasiswa[i];
            }
        }

        return terbesar;
    }

    public String toString() {
        return "Nama: " + nama + "\nIPK: " + ipk;
    }
}
