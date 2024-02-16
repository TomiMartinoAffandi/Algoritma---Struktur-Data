import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program menghitung tugas akhir\n=========================");
        System.out.print("Masukan Nilai Tugas :");
        float nTugas = input.nextFloat();
        System.out.print("Masukan Nilai Quiz :");
        float nQuiz = input.nextFloat();
        System.out.print("Masukan Nilai UTS :");
        float nUTS = input.nextFloat();
        System.out.print("Masukan Nilai UAS :");
        float nUAS = input.nextFloat();
        System.out.println("=========================\n=========================");

        if (nTugas >100 || nQuiz >100 || nUTS >100 || nUAS >100) {
            System.out.println("nilai tidak valid\n=========================\n=========================");
            System.exit(0);
        }

        nTugas *= 0.20;
        nQuiz *= 0.20;
        nUTS *= 0.30;
        nUAS *= 0.30;

        float nilaiAkhir = 0;
        String nilaiHuruf;
        nilaiAkhir=nTugas+nQuiz+nUTS+nUAS;
        System.out.println("nilai akhir :"+nilaiAkhir);

        if (nilaiAkhir >80 && nilaiAkhir <=100) {
            nilaiHuruf = "A";
            System.out.println(nilaiHuruf+"\n=========================\n=========================\nSelamat Anda Lulus");
        }
        else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            nilaiHuruf = "B+";
            System.out.println(nilaiHuruf+"\n=========================\n=========================\nSelamat Anda Lulus");
        }
        else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            nilaiHuruf = "B";
            System.out.println(nilaiHuruf+"\n=========================\n=========================\nSelamat Anda Lulus");
        }
        else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            nilaiHuruf = "C+";
            System.out.println(nilaiHuruf+"\n=========================\n=========================\nSelamat Anda Lulus");
        }
        else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            nilaiHuruf = "C";
            System.out.println(nilaiHuruf+"\n=========================\n=========================\nSelamat Anda Lulus");
        }
        else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            nilaiHuruf = "D";
            System.out.println(nilaiHuruf+"\n=========================\n=========================\nMaaf Anda Tidak Lulus");
        }
        else if (nilaiAkhir <=39) {
            nilaiHuruf = "E";
            System.out.println(nilaiHuruf+"\n=========================\n=========================\nMaaf Anda Tidak Lulus");
        }
        
    }
    
}