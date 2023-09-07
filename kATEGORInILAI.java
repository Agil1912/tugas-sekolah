import java.util.Scanner;

public class kATEGORInILAI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MaSukin Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukin Nilai "+nama);
        int nilai = input.nextInt();

        String predikat = null;
        String kategori = null;
        //96 - 100
        if(nilai > 96 && nilai <= 100){
            predikat = "A+";
            kategori = "sangat baik";
        }
        
        else if (nilai >91 && nilai <=95){
            predikat = "A";
            kategori = "BAGUS";
        }
        else if (nilai >86 && nilai <=90){
            predikat = "A-";
            kategori = "KERJA BAGUS";
        }
        else if (nilai >81 && nilai <=85){
            predikat = "B";
            kategori = "YAUDAH BAGUS";
        }
        else if (nilai >76 && nilai <=80){
            predikat = "B--";
            kategori = "HMM LEBIH LUMAYAN";
        }
        else if (nilai >71 && nilai <=75){
            predikat = "C++";
            kategori = "LUMAYAN";
        }
        else if (nilai >66 && nilai <=70){
            predikat = "C-";
            kategori = "BURUK";
        }
        else if (nilai >61 && nilai <=65){
            predikat = "D";
            kategori = "MASIH JELEK";
        }
        else if (nilai >56 && nilai <=60){
            predikat = "E";
            kategori = "JELEKKKKK";
        }
        else if (nilai >0 && nilai <=55){
            predikat = "Z";
            kategori = "JELEK BET";
        }

        System.out.println("Nama: " + nama);
        System.out.println("Nilai " + nilai);
        System.out.println(predikat);
        System.out.println(kategori);


    }
    
}
