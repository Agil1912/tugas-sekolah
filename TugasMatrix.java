package ARRAY.MATRIX;
import java.util.Scanner;
public class TugasMatrix {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in); //untuk deklarasi variabel scanner

        System.out.print("Masukkan Jumlah Baris yang di inginkan: ");
        int baris = input.nextInt();
        System.out.print("Masukkan Jumlah Kolom yang di inginkan: ");
        int Kolom = input.nextInt(); 
        //ini untuk supaya user bisa input jumlah baris dan kolomnya sesuai keinginan user

        int matrix[][] = new int[baris][Kolom];
        //buat deklarasi matrixnya dengan array multi dimensi,
        //dengan jumlah dimensi yang kita atur menggunakan input baris dan jumlah sebelumnya

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            System.out.print("Masukkan Nilai Matrix "+i+" Kolom "+j+" : ");
            matrix[i][j] = input.nextInt();
     }
        System.out.println();
}
        //pengulangan supaya user bisa menginput nilai setiap matrix sesuai keinginan user itu sendiri

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + ", ");
      }
            System.out.println();
}
    }
    
}
