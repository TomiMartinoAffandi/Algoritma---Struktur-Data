package JobSheet2;
import java.util.Scanner;
public class dragonmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dragon drake = new dragon();
        drake.height = 10;
        drake.width = 10;
        drake.printPosition();
        String masukan;
        while (true) {
            System.out.println("Luas arena: "+ drake.height +", "+ drake.width +" (Ketika luas arena maka game akan berakhir)");
            System.out.print("Masukan perintah (w/a/s/d): ");
            masukan = input.nextLine();
            if (masukan.equals("w")) {
                drake.moveUp();
                drake.printPosition();
            }else if (masukan.equals("a")) {
                drake.moveLeft();
                drake.printPosition();
            }
            if (masukan.equals("s")) {
                drake.moveDown();
                drake.printPosition();
            }
            if (masukan.equals("d")) {
                drake.moveRight();
                drake.printPosition();
            }
        }
        
    }
}
