package Jobsheet8;
import java.util.Scanner;

public class queueMain {
    public static void menu(){
        System.out.println("Masukan operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.println("----------------------------------");
            System.out.print("pilih operasi: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan kapasitas queue: ");
        int n = sc.nextInt();
        Queue queue = new Queue(n);

        do {
            menu();
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("masukan data baru: ");
                    int dataMasuk = sc.nextInt();
                    sc.nextLine();
                    queue.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = queue.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("data yang dikeluarkan: "+dataKeluar);
                        break;
                    }
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peek();
                    break;
                case 5:
                    queue.clear();
                    break;
                case 6:
                    System.exit(0);
            
                default:
                    System.out.println("pilihan tidak tersedia");;
            }
        } while (true);
        
    }
}
