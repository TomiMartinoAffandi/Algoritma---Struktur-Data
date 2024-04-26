package Jobsheet8;

public class pembeliWarung {
    String nama;
    int noHp;

    pembeliWarung(){

    }

    pembeliWarung(String nama, int noHp){
        this.nama=nama;
        this.noHp=noHp;
    }

    pembeliWarung[] data;
    int front, rear, size, max;

    public pembeliWarung(int n){
        max = n;
        data = new pembeliWarung[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: "+data[front].nama + " " + data[front].noHp);
        } else {
            System.out.println("queue masih kosong");
        }
    }

    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang: "+data[rear].nama + " " + data[rear].noHp);
        } else {
            System.out.println("queue masih kosong");
        }
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("queue masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + " " + data[i].noHp);
                i = (i+1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noHp);
            System.out.println("jumlah elemen = "+size);
        }
    }

    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        }else {
            System.out.println("queue masih kosong");
        }
    }

    public void enqueue(pembeliWarung dt){
        if (isFull()) {
            System.out.println("queue sudah penuh");
        }else {
            if (isEmpty()) {
                front = rear = 0;
            }else {
                if (rear == max - 1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public pembeliWarung dequeue(){
        pembeliWarung dt = new pembeliWarung();
        if (isEmpty()) {
            System.out.println("queue masih kosong");
        }else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else {
                if (front == max -1) {
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return dt;
    }

    public int findPembeli(String cari){ 
        int posisi = -1;
        for (int i = 0; i < max; i++) {
            if (data[i].nama.equals(cari)) { 
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String x, int pos){
        if (pos>-1) {
            System.out.println("data : "+x+" ditemukan pada antrian ke: "+(pos+1));
        }else {
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }
}
