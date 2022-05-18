package Tugas;

public class StrukMain {
    public static void main(String[] args) {
        StackStrukRidwan stack = new StackStrukRidwan(8);
        StrukBelanjaRidwan struk1 = new StrukBelanjaRidwan(
                101, "6 Februari 2022", 2, 20000);
        stack.push(struk1);
        StrukBelanjaRidwan struk2 = new StrukBelanjaRidwan(
                102, "13 Februari 2022", 4, 40000);
        stack.push(struk2);
        StrukBelanjaRidwan struk3 = new StrukBelanjaRidwan(
                103, "20 Februari 2022", 6, 60000);
        stack.push(struk3);
        StrukBelanjaRidwan struk4 = new StrukBelanjaRidwan(
                104, "27 Februari 2022", 8, 80000);
        stack.push(struk4);
        StrukBelanjaRidwan struk5 = new StrukBelanjaRidwan(
                105, "6 Maret 2022", 10, 100000);
        stack.push(struk5);
        StrukBelanjaRidwan struk6 = new StrukBelanjaRidwan(
                106, "13 Maret 2022", 12, 120000);
        stack.push(struk6);
        StrukBelanjaRidwan struk7 = new StrukBelanjaRidwan(
                107, "20 Maret 2022", 14, 140000);
        stack.push(struk7);
        StrukBelanjaRidwan struk8 = new StrukBelanjaRidwan(
                108, "27 Maret 2022", 16, 160000);
        stack.push(struk8);

        System.out.println("====== Data Semua Struk Belanja Sebelum Ditukarkan ======");
        stack.print();
        System.out.println("Pengambilan 5 struk untuk ditukarkan");
        for (int i = 0; i < 5; i++) {
            stack.pop();
        }
        System.out.println("====== Data Struk yang masih di dalam stack ======");
        stack.print();

    }
}
