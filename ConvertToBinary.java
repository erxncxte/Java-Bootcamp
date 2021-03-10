import java.util.Scanner; 

public class ConvertToBinary {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num = scnr.nextInt();
      while (num > 0){
        System.out.print(num % 2);
        num = num / 2;
      }
      scnr.close();
   }
}
