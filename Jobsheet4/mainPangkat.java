import java.util.Scanner;

import JobSheet3.balok;
public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================");
        System.out.print("Masukan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        
        pangkat png1 = new pangkat();
        System.out.println("HASIL PANGKAT - BRUTE FORCE & DIVIDED and CONQUER");
        System.out.println("HASIL PANGKAT - BRUTE FORCE: "+png1.pangkatBF(6, 2));
        System.out.println("HASIL PANGKAT - DIVIDED and CONQUER: "+png1.pangkatDC(6, 2));
        
        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat();
            System.out.print("Masukan nilai yang hendak dipangkatkan: ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukan nilai pemangkat: ");
            png[i].pangkat = sc.nextInt();
        }

        while (true) {
            System.out.println("Pilih Metode: \n1. Brute Force\n2. Divided and Conquer\n3. Exit");
            System.out.print("Input: ");
            int Pilih = sc.nextInt(); 
            switch (Pilih) {
                case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE: ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;          
                case 2:
                System.out.println("HASIL PANGKAT - DIVIDED and CONQUER");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    
                }
                break;
                case 3:
                System.out.println("anda telah keluar");
                System.exit(Pilih);
                default:
                System.out.println("input salah");
            }
        }
        
        
    }
}
