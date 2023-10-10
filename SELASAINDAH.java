import java.util.Scanner;
public class SELASAINDAH {
    public static void main(String[] args) {
        
        char ulang;
        int totalBarang = 0;
        int totalHarga
        Scanner input = new Scanner(System.in);
        String namaBarang;
        int harga = 0;
        int total = 0;
        boolean status = true;
        do {
        System.out.println("WARUNG SEDERHANA ARIEF MUHAMMAD");
        System.out.println("List harga : \n 1. RUJAK CINGUR: 20000000\n 2. RUJAK ESKRIM: 10000000\n 3. ESTEH ANGET: 100000\n 4. NASI KEBAB: 50000");
        System.out.println("Masukkan Nomor Barang Yang Ingin Dibeli :");
        int barang = input.nextInt();
    
    
        if(barang == 1){
            namaBarang = "RUJAK CINGUR";
        } else if(barang == 2) {
            namaBarang = "RUJAK ESKRIM";
        } else if(barang == 3){
            namaBarang = "ESTEH ANGET";
        } else if(barang == 4){
            namaBarang = "NASI KEBAB";
        } else {
            namaBarang = "undefined";
        }
        switch(barang){
            case 1 :
            harga = 20000000;
            total += harga;
            break;
            case 2 :
            harga = 10000000;
            total += harga;
            break;
            case 3 :
            harga = 100000;
            total += harga;
            break;
            case 4:
            harga = 50000;
            total += harga;
            break;
            default :
            harga = 0;
        }
        System.out.println(barang + "." + " Harga " + namaBarang + " " + harga);
        System.out.println("Ingin Tambah Item? Yes/No");
        String confirm = input.next();
        if(confirm.equalsIgnoreCase("No")){
            status=false;
        } else {
            status = true;
        }
        }while (status);
        
        System.out.println("Total = " + total);

        System.out.println("");
        
        }
    }
    

