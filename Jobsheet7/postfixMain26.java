package Jobsheet7;
import java.util.Scanner;
public class postfixMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukan Ekspresi Matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        postfix26 post = new postfix26(total);
        P = post.konversi(Q);
        System.out.println("postfix: "+P);
    }
    
}
