package JobSheet3;
import java.util.Scanner;
public class dataMhsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan jumlah mahasiswa yang ingin di input: ");
        dataMhs[] dMhs = new dataMhs[sc.nextInt()];

        for (int i = 0; i < dMhs.length; i++) {
            dMhs[i] = new dataMhs();
            System.out.println("Masukan data mahasiswa ke: "+(i+1));
            System.out.print("Masukan Nama: ");
            sc.nextLine();
            dMhs[i].nama = sc.nextLine();
            System.out.print("Masukan NIM: ");
            dMhs[i].nim = sc.nextLine();
            System.out.print("Masukan jenis kelamin: ");
            dMhs[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukan IPK: ");
            dMhs[i].ipk = sc.nextDouble();
        }

        for (int i = 0; i < dMhs.length; i++) {
            System.out.println("Data Mahasiswa ke: "+(i+1));
            System.out.println("Nama: "+dMhs[i].nama);
            System.out.println("NIM: "+dMhs[i].nim);
            System.out.println("Jenis Kelamin: "+dMhs[i].jenisKelamin);
            System.out.println("IPK: "+dMhs[i].ipk);
        }
        
    }
}
