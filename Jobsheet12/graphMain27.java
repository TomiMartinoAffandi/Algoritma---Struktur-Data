package Jobsheet12;

public class graphMain27 {
    public static void main(String[] args) {
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
        
    }
}
