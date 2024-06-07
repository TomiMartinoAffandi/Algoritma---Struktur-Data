package Jobsheet12;

public class graphMatrik26 {
    int vertex;
    int[][] matriks;
    
    public graphMatrik26(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung "+(char)('A'+i)+": ");
            for (int j = 0; j < matriks.length; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung "+(char)('A'+j)+"("+matriks[i][j]+"m), ");
                }
            }
            System.out.println();
        }
    }

    public int InDegree(int asal){
        int totalIn = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                totalIn++;
            }
        }
        return totalIn;
    }

    public int OutDegree(int asal){
        int totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[asal][i] != 0) {
                totalOut++;
            }
        }
        return totalOut;
    }

    public int degree(int asal){
        return InDegree(asal) + OutDegree(asal);
    }
}
