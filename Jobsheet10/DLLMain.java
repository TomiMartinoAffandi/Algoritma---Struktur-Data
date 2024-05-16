package Jobsheet10;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkListed dll = new DoubleLinkListed();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("====================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("====================================");
        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("====================================");
        dll.clear();
        dll.print();
        System.out.println("Size: "+dll.size());
    }
}
