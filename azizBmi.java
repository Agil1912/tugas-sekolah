import java.util.Scanner;

public class azizBmi {
     public static void main(String[] args) {

        Scanner dataBmi = new Scanner(System.in); 
      
        System.out.println("== Program Sederhana BMI ==");

        System.out.println("Input Berat Kamuuu (KG): ");
        double berat = dataBmi.nextDouble();

        System.out.println("Input Tinggi Kamu Chinese (m): ");
        double tinggi = dataBmi.nextDouble();

        double rumusBmi = BMI(berat, tinggi);
        System.out.println("BMI: "+ rumusBmi);

        dataBmi.close();
   }

   private static double BMI(double berat, double tinggi){
        return berat / (tinggi*tinggi);
   }
}
