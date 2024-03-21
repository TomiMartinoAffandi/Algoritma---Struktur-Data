package Jobsheet5;

public class mainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Swiss-Belinn", "Malang", 550000, (byte) 5);
        Hotel h2 = new Hotel("Everyday Smart", "jakarta", 260000, (byte) 4);
        Hotel h3 = new Hotel("Oyo", "Yogyakarta", 70000, (byte) 1);
        Hotel h4 = new Hotel("Hotel Syariah 99", "Bandung", 230000, (byte) 3);
        Hotel h5 = new Hotel("Embun Pagi", "Blitar", 160000, (byte) 2);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data Hotel sebelum sorting: ");
        list.tampilAll();

        System.out.println("Data Hotel setelah sorting asc berdasarkan Harga: ");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data Hotel setelah sorting desc berdasarkan Bintang: ");
        list.selectionSort();
        list.tampilAll();
    }
}
