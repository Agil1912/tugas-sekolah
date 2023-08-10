import java.util.Scanner;

   public class volTabung {
    public static void main(String[] args) {
        
        Scanner tabung = new Scanner(System.in);

        System.out.println("input jari jari dong gantenk");
        double jari = tabung.nextDouble();

        System.out.println("input tinggi gantenk");
        double tinggi = tabung.nextDouble();

        double phi = 3.14;

        double rumusTabung = phi*(jari*jari)*tinggi;
        System.out.println("Ini dia hasilnya "+ rumusTabung);

        tabung.close();

    }
    
}
