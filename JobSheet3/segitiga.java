package JobSheet3;

public class segitiga {
    public int alas;
    public int tinggi;

    public  segitiga(int a, int b){
        alas = a;
        tinggi = b;
    }

    public int luasSegitiga(){
        int luas;
        return luas=alas*tinggi/2;
    }

    public int kelilingSegitiga(){
        int sisiMiring;
        int keliling;
        sisiMiring=((alas * alas)+(tinggi * tinggi));
        sisiMiring = (int) (Math.sqrt(sisiMiring));
        return keliling = alas+tinggi+sisiMiring;
    }
}
