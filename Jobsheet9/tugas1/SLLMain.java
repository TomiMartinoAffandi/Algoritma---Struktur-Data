package Jobsheet9.tugas1;

public class SLLMain {
    public static void main(String[] args) {
        singleLinkedList singLL = new singleLinkedList();
        singLL.print();
        singLL.addLast(new mahasiswa(115, "Sari"));
        singLL.print();
        singLL.addFirst(new mahasiswa(111, "Anton"));
        singLL.print();
        singLL.insertAfter(111, new mahasiswa(112, "Prita"));
        singLL.print();
        singLL.insertAt(2, new mahasiswa(113, "Yusuf"));
        singLL.print();
        singLL.insertAfter("Yusuf", new mahasiswa(114, "Doni"));
        singLL.print();
    }
}
