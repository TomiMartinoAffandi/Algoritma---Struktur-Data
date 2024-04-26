package Jobsheet8;
import java.util.Scanner;
public class pembeliWarungMain {
    public static void menu() {
        System.out.println("1. tambah antrian");
        System.out.println("2. kurangi antrian");
        System.out.println("3. cek antrian terdepan");
        System.out.println("4. cek antrian paling belakang");
        System.out.println("5. cari antrian(by nama)");
        System.out.println("6. lihat semua antrian");
        System.out.println("7. exit");
        System.out.println("-----------------------------------------");
        System.out.print("pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan kapasitas antrian: ");
        int jumlah = sc.nextInt();
        pembeliWarung antri = new pembeliWarung(jumlah);

        do {
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No. Handphone: ");
                    int noHp = sc.nextInt();
                    sc.nextLine();
                    pembeliWarung pb = new pembeliWarung(nama, noHp);
                    antri.enqueue(pb);
                    break;
                case 2:
                    pembeliWarung data = antri.dequeue();
                    if (!"".equals(data.nama) && data.noHp != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " "+data.noHp);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.print("masukan nama pelanggan: ");
                    String namaPelanggan = sc.nextLine();
                    int posisi = antri.findPembeli(namaPelanggan);
                    antri.tampilPosisi(namaPelanggan, posisi);
                    break;
                case 6:
                    antri.print();
                    break;
                case 7:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("input salah");
                    break;
            }
        }while (true);
    }
}