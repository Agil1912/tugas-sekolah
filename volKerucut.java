import java.util.Scanner;

  public class volKerucut {

     public static void main(String[] args) {
        
        Scanner kerucut = new Scanner(System.in);

        System.out.println("Input jari jari donh");
        double jari = kerucut.nextDouble();

        System.out.println("Input tinggi: ");
        double tinggi = kerucut.nextDouble();

        double phi = 3.14;

        double volKerucut = phi*(jari*jari*tinggi)/3;
        System.out.println("Hasilnya gantenk: "+ volKerucut);

        kerucut.close();
     }
  }