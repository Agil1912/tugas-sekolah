import java.util.Scanner;
  
 public class volumeBola {
    public static void main(String[] args) {
        
        Scanner bola = new Scanner(System.in);

        System.out.println("Input Jari Jari: ");
        double jari = bola.nextDouble();

        double phi = 3.14;

        double volBola = phi*(jari*jari*jari)*4/3;
        System.out.println("Hasil: "+ volBola);
        bola.close();


    }
    
}
