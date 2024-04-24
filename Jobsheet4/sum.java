public class sum {
    int elemen;
    double keuntungan[];
    double total;

    public sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        System.out.println("r:"+r + " l :"+l);  
        if (l==r) {
            return arr[l];
        }else if (l < r) {
            int mid = (l + r) / 2;
            double rsum = totalDC(arr, mid+1, r);
            //System.out.println("rsum: "+rsum);
            double lsum = totalDC(arr, l,mid-1);
            // System.out.println("lsum: "+lsum);
            // System.out.println("arr mid:"+arr[mid]);
            return lsum+rsum+arr[mid];
        }
        return 0;
        
    }
}
