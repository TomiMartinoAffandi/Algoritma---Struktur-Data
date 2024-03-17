public class showroomMain {
    public static void main(String[] args) {
        showroom[] shwArray = new showroom[8];

        shwArray[0] = new showroom("BMW", "M2 Coupe", "2016", 6816, 728);
        shwArray[1] = new showroom("Ford", "Fiesta ST", "2014", 3921, 575);
        shwArray[2] = new showroom("Nissan", "370Z", "2009", 4360, 657);
        shwArray[3] = new showroom("Subaru", "BRZ", "2014", 4058, 609);
        shwArray[4] = new showroom("SUbaru", "Impreza WRX STI", "2013", 6255, 703);
        shwArray[5] = new showroom("Toyota", "AE86 Trueno", "1986", 3700, 553);
        shwArray[6] = new showroom("Toyota", "86/GT86", "2014", 4180, 609);
        shwArray[7] = new showroom("Volkswagen", "Golf GTI", "2014", 4180, 631);

        int topAcceTertinggi = topAcceTertinggi(shwArray, 0, shwArray.length - 1);
        int topAcceTerendah = topAcceTerendah(shwArray, 0, shwArray.length - 1);
        double ratarataTopPower = ratarataTopPower(shwArray);

        System.out.println("Top acceleration tertinggi: " + topAcceTertinggi);
        System.out.println("Top acceleration terendah: " + topAcceTerendah);
        System.out.println("Rata-rata top power: " + ratarataTopPower);
        
    }

    public static int topAcceTertinggi(showroom[] arr, int l, int r) {
        if (l == r) return arr[l].topAcce;

        int mid = (l + r) / 2;

        int leftMax = topAcceTertinggi(arr, l, mid);
        int rightMax = topAcceTertinggi(arr, mid + 1, r);

        return Math.max(leftMax, rightMax);
    }

    public static int topAcceTerendah(showroom[] arr, int l, int r) {
        if (l == r) return arr[l].topAcce;

        int mid = (l + r) / 2;

        int leftMin = topAcceTerendah(arr, l, mid);
        int rightMin = topAcceTerendah(arr, mid + 1, r);

        return Math.min(leftMin, rightMin);
    }

    public static double ratarataTopPower(showroom[] arr) {
        int sum = 0;
        for (showroom car : arr) {
            sum += car.topAcce;
        }
        return (double) sum / arr.length;
    }
}
