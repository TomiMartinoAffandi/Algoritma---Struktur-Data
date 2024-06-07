package Jobsheet12;

import Jobsheet9.node;

public class DoubleLinkListed {
    node27 head;
    int size;

    public DoubleLinkListed() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new node27(null, item, jarak, null);
        }
        else{
            node27 newNode27 = new node27(null, item, jarak, head);
            head.prev = newNode27;
            head = newNode27;
        }
        size++;
    }
    
    public int getJarak(int index) throws Exception {
        if (isEmpty() || index > size) {
            throw new Exception("nilai indeks diluar batas");
        }
        node27 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    
    public void remove(int index) {
        node27 current = head;
            while (current != null) {
                if (current.data == index) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }else{
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    break;
                }
                current = current.next;
            }
        size--;
    }
    
    
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("nilai indeks diluar batas");
        }
        node27 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }
    
}
