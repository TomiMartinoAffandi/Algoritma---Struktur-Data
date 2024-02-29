package JobSheet3;

public class luaspermukaandanvolume {
    public double r;
    public double s;
    public double panjang;
    public double tinggi;

    public double luasPermukaanKerucut(){
        double luasPermukaan = Math.PI * r * (r + s);
        return luasPermukaan;
    }

    public double volumeKerucut(){
        double height = ((r*r)+(s*s));
        double volume = (Math.PI * Math.pow(r, 2) * height) / 3.0;
        return volume;
    }

    public double luasPermukaanlimasSegiEmpat(){
        double luasPermukaan = Math.pow(panjang, 2) + (4 * panjang * tinggi / 2 );
        return luasPermukaan;
    }

    public double volumeLimasSegiEmpat(){
        double volume = (Math.pow(panjang, 2) * tinggi) / 3.0;
        return volume;
    }

    public double luasPermukaanBola(){
        double luasPermukaan = 4 * Math.PI * Math.pow(r, 2);
        return luasPermukaan;
    }

    public double volumeBola(){
        double volume = 4 * Math.PI * Math.pow(r, 3) / 3;
        return volume;
    }



    


}
