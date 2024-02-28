package JobSheet3;

public class main {
    public static void main(String[] args) {

        ContohOverloadingKonstruktor obj1 = new ContohOverloadingKonstruktor();
        ContohOverloadingKonstruktor obj2 = new ContohOverloadingKonstruktor("John");
        ContohOverloadingKonstruktor obj3 = new ContohOverloadingKonstruktor("Jane", 25);

        obj1.tampilkanInfo();
        obj2.tampilkanInfo();
        obj3.tampilkanInfo();
    }
}

