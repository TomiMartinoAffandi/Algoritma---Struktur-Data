package Jobsheet9.tugas2;

public class LinkedListQueue {
    node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked Queue kosong");
        } else {
            node tmp = head;
            System.out.print("Isi Linked Queue:\t");
            while (tmp != null) {
                System.out.print(tmp.data + " \t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void enqueue(mahasiswa input) {
        node ndInput = new node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    mahasiswa dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            mahasiswa tmp = head.data;
            head = head.next;
            return tmp;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Elemen terdepan: " + head.data);
        }
    }

    void clear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            head = tail = null;
        }
    }

    void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Elemen terbelakang: " + tail.data);
        }
    }
}
