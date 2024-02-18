
public class PraktikumFungsi {
    public static void main(String[] args) {
        String pemisah = "=============================================================";
        System.out.printf("%-20s", "Cabang Toko");
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.print("\t" + namaBunga[i]);
        }
        System.out.println();
        for (int i = 0; i < namaToko.length; i++) {
            System.out.printf("%-20s", namaToko[i]);
            for (int j = 0; j < stokToko.length; j++) {
                System.out.print("\t" + stokToko[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("harga tiap bunga: ");
        for (int i = 0; i < namaBunga.length; i++) {
           System.out.print(namaBunga[i]+": "+harga[i]+"/pcs\t");
        }
        System.out.println();
        System.out.println(pemisah);
        pendapatanPerCabang();
        System.out.println(pemisah);
        System.out.println("Stock Cabang Royal Garden Setelah Pengurangan: ");
        stockBaru4();
    }
    static String[] namaBunga = {"Aglonema", "Keladi  ", "Alocasia", "Mawar   "};
    static String namaToko[] = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
    static int stokToko[][] = {{ 10, 5, 15, 7 }, { 6, 11, 11, 12 }, { 2, 10, 10, 5 },{ 5, 7, 12, 9 }};
    static int harga[] = {75000, 50000, 60000, 10000};
    static void stockBaru4() {
        int[] bungaMati = {1, 2, 0, 5};
        int[] StockBaru = new int[4];
        for (int i = 0; i < stokToko.length; i++) {
            StockBaru[i] = stokToko[3][i] - bungaMati[i];
            System.out.println(namaBunga[i] + ": " + StockBaru[i]);
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
}