import java.util.Scanner;
public class PraktikumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] label = {"Pancasila", "KTI", "CTPS", "MatDas", "Bahasa Inggris", "DasPro", "PrakDasPro", "K3"};
        double[] nilai = new double[8];
        String [] nilaiHuruf = new String[8];
        double [] nilaiBobot = new double[8];
        int [] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        float IP = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("masukan nilai angka untuk MK "+ label[i] + ": ");
            nilai[i] = input.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (nilai[i] >80 && nilai[i] <=100) {
                nilaiHuruf[i] = "A";
                nilaiBobot[i] = 4.0;
            }else if (nilai[i] >73 && nilai[i] <=80) {
                nilaiHuruf[i] = "B+";
                nilaiBobot[i] = 3.5;
            }else if (nilai[i] >65 && nilai[i] <=73) {
                nilaiHuruf[i] = "B";
                nilaiBobot[i] = 3;
            }else if (nilai[i] >60 && nilai[i] <=65) {
                nilaiHuruf[i] = "C+";
                nilaiBobot[i] = 2.5;
            }else if (nilai[i] >50 && nilai[i] <=60) {
                nilaiHuruf[i] = "C";
                nilaiBobot[i] = 2;
            }else if (nilai[i] >39 && nilai[i] <=50) {
                nilaiHuruf[i] = "D";
                nilaiBobot[i] = 1;
            }else if (nilai[i] <=39) {
                nilaiHuruf[i] = "E";
                nilaiBobot[i] = 0;
            }
        }
        System.out.printf("%-40s%-20s%-20s%-20s\n", "MatKul", "Nilai Huruf", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s%-20s%-20s%-20s\n", label[i], nilai[i], nilaiHuruf[i], nilaiBobot[i]);
        }
        for (int i = 0; i < 8; i++) {
            IP += nilaiBobot[i]*sks[i];
        }
        IP /= 18;

        System.out.printf("IP: %.2f", IP);
    }
}
