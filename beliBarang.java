import java.util.Scanner;

public class beliBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah item yg dibeli: ");
        int jumlahitem = input.nextInt();

        int i = 1;
        int harga = 0;
        int jumlahbarang = 0;
        int totalpembelian = 0;
        while (jumlahitem >= i) {
            
            System.out.println(i + ". " + "Nama Barang: ");
            String namabarang = input.next();

            System.out.println(i + ". " +"Harga: ");
            harga = input.nextInt();

            System.out.println(i + ". "+"jumlah: ");
            jumlahbarang = input.nextInt();
            System.out.println("=========");

            totalpembelian += harga * jumlahbarang;
            i++;
       }

       System.out.println("jumlah item yang dibeli: "+ jumlahitem);
       System.out.println("Total pembelian: "+ totalpembelian);

    }
}
