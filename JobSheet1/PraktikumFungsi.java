
public class PraktikumFungsi {
    static String[] namaBunga = {"Aglonema", "Keladi  ", "Alocasia", "Mawar   "};
    static String namaToko[] = {
        "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"
    };
        static int stokToko[][] = {
        { 10, 5, 15, 7 },
        { 6, 11, 11, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 }
    };
    static int harga[] = {
        75000, 50000, 60000, 10000
    };
    static void stockCabang4() {
        int[] bungaMati = {1, 2, 0, 5};
        int[] newStock = new int[4];
        for (int i = 0; i < stokToko.length; i++) {
            newStock[i] = stokToko[3][i] - bungaMati[i];
            System.out.println(namaBunga[i] + "        : " + newStock[i]);
        }
    }
    static void pendapatanPerCabang() {
        System.out.println("Pendapatan tiap cabang jika semua bunga habis terjual");
        for (int i = 0; i < stokToko.length; i++) {
            int[] pendapatan = new int[4];
            for (int j = 0; j < stokToko[0].length; j++){
                pendapatan[i] += stokToko[i][j] * harga[i];
            }
            System.out.println("Royal Garden "+(i+1)+": "+pendapatan[i]);
        }
    }
    public static void main(String[] args) {
        String pemisah = "=============================================================";
        System.out.printf("%-20s%-15s%-15s%-15s%-15s\n", "Nama Cabang", "Aglonema", "Keladi", "Alcosia", "Mawar");
            for (int i = 0; i < stokToko.length; i++) {
                System.out.printf("%-20s", namaToko[i]);
                for (int j = 0; j < stokToko.length; j++) {
                    System.out.printf("%-15s", stokToko[i][j]);
                }
                System.out.println();
            }
        System.out.println("Harga tiap - tiap bunga :\nAlgonema: 75000/pcs,\tKeladi: 50000/pcs,\tAlcosia: 60000/pcs,\tMawar: 10000/pcs");
        System.out.println(pemisah);
        pendapatanPerCabang();
        System.out.println(pemisah);
        System.out.println("Stock Cabang Royal Garden Setelah Pengurangan: ");
        stockCabang4();
    }
}