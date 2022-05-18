package Tugas;

public class StackStrukRidwan {
    StrukBelanjaRidwan[] data;
    int top;
    int size;

    StackStrukRidwan(int size) {
        this.size = size;
        data = new StrukBelanjaRidwan[size];
        top = -1;
    }

    boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean IsFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(StrukBelanjaRidwan struk) {
        if (IsFull()) {
            System.out.println("Stack sudah penuh");
        } else {
            top++;
            data[top] = struk;
        }
    }

    void print() {
        if (IsEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println("========= Data struk ke " + (i + 1) + "=========");
                System.out.println("No Transaksi  : " + data[i].noTransaksi);
                System.out.println("Tgl Pembelian : " + data[i].tanggal);
                System.out.println("Jumlah Barang : " + data[i].jumlahBarang);
                System.out.println("Total Harga   : " + data[i].totalHarga);
                System.out.println("==================================");
                System.out.println();
            }
        }
    }

    void pop() {
        if (IsEmpty()) {
            System.out.println("Stack masih kosong");
        } else {
            StrukBelanjaRidwan keluar = data[top];
            top--;
            System.out.println("Data yang keluar :");
            System.out.println("No Transaksi  : " + keluar.noTransaksi);
            System.out.println("Tgl Pembelian : " + keluar.tanggal);
            System.out.println("Jumlah Barang : " + keluar.jumlahBarang);
            System.out.println("Total Harga   : " + keluar.totalHarga);
            System.out.println();
        }
    }
}
