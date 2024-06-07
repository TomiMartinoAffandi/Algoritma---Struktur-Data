package Jobsheet12;
import java.util.Scanner;
public class graphMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        graph27 gedung = new graph27(6);
        gedung.addEdgeDir(0, 1, 50);
        gedung.addEdgeDir(0, 2, 100);
        gedung.addEdgeDir(1, 3, 70);
        gedung.addEdgeDir(2, 3, 40);
        gedung.addEdgeDir(3, 4, 60);
        gedung.addEdgeDir(4, 5, 80);
        try{
            gedung.degree(0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }try{
            gedung.printGraf();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }try{
            gedung.removeEdge(1, 3);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }try{
            gedung.printGraf();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.print("masukan gedung asal: ");
        int asal = sc.nextInt();
        System.out.print("masukan gedung tujuan: ");
        int tujuan = sc.nextInt();
        try {
            gedung.checkPath(asal, tujuan);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        graphMatrik26 gdg = new graphMatrik26(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.println();
        System.out.println("degree tiap gedung: ");
        for (int i = 0; i < gdg.vertex; i++) {
            System.out.println("Gedung "+(char)('A'+i));
            System.out.println("InDegree dari gedung "+(char)('A'+i)+": "+gdg.InDegree(i));
            System.out.println("OutDegree dari gedung "+(char)('A'+i)+": "+gdg.OutDegree(i));
            System.out.println("Degree dari gedung "+(char)('A'+i)+": "+gdg.degree(i));
        }
    }
}
