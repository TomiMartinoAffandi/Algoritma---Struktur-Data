package Jobsheet9.tugas2;

public class LLQMain {
    public static void main(String[] args) {
        LinkedListQueue singLQ = new LinkedListQueue();
        singLQ.print();
        singLQ.enqueue(new mahasiswa(111, "Anton"));
        singLQ.print();
        singLQ.enqueue(new mahasiswa(112, "Prita"));
        singLQ.print();
        singLQ.enqueue(new mahasiswa(113, "Yusuf"));
        singLQ.print();
        singLQ.enqueue(new mahasiswa(114, "Doni"));
        singLQ.print();
        singLQ.enqueue(new mahasiswa(115, "Sari"));
        singLQ.print();
        singLQ.peek();

        System.out.println("==================================");

        mahasiswa dequeue = singLQ.dequeue();
        System.out.println("Elemen yang di-dequeue: " + dequeue);
        dequeue = singLQ.dequeue();
        System.out.println("Elemen yang di-dequeue: " + dequeue);

        System.out.println("==================================");

        singLQ.print();

        System.out.println("==================================");
        singLQ.peek();
        singLQ.peekRear();
    }
}
