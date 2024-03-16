import java.util.Scanner;
public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Masukan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat();
            System.out.println("Masukan nilai yang hendak dipangkatkan: ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukan nilai pemangkat: ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE: ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        
        System.out.println("HASIL PANGKAT - DIVIDED and CONQUER");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            
        }
    }
}
