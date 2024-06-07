package Jobsheet12;

import JobSheet3.main;

public class graph27 {
    int vertex;
    DoubleLinkListed list[];

    public graph27(int v){
        vertex = v;
        list = new DoubleLinkListed[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkListed();
        }
    }

    public void addEdgeDir(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size() ; j++) {
                if (list[i].getJarak(j) == asal) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].getJarak(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari gedung "+(char) ('A'+asal)+": " +totalIn);
        System.out.println("OutDegree dari gedung "+(char) ('A'+asal)+": " +totalOut);
        System.out.println("Degree dari gedung "+(char) ('A'+asal)+": " +(totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdge(){
        for (int i = 0; i < list.length; i++) {
            list[i].clear();
        }
        System.out.println("graf berhasil dikosongkan");
    }

    public void printGraf()throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung "+(char)('A'+i)+" terhubung dengan");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char)('A'+list[i].get(j))+"(" +list[i].getJarak(j)+"m), ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void checkPath(int asal, int tujuan)throws Exception{
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                System.out.println("Gedung "+(char)('A'+asal)+ "dan" +(char)('A'+tujuan)+ " bertetangga");
                return;
            }
        }
        System.out.println("Gedung "+(char)('A'+asal)+ "dan" +(char)('A'+tujuan)+ " tidak bertetangga");
    }
}