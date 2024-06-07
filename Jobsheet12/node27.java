package Jobsheet12;

public class node27 {
    int data;
    node27 next, prev;
    int jarak;

    node27(node27 prev, int data, int jarak, node27 next){
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
