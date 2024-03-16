public class pangkat {
    public int nilai, pangkat;

    public pangkat(){

    }

    public pangkat(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *=a; 
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n == 0) {
            return 1;
        } else{ 
            if (n % 2 == 1) {
            return a * pangkatDC(a, n - 1);
                
            } else {
            int hasil = pangkatDC(a, n / 2);
            return hasil * hasil;
            }
        }
    }
}
