import java.util.Scanner;

public class ContainsCharacter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int limit = scnr.nextInt();
      String condition;
      String[] userWords = new String[limit];
      for (int i = 0; i < limit; i++){
         userWords[i] = scnr.next();
      }
    
      condition = userWords[limit];
      for (int i = 0; i < limit; i++) {
         if (userWords.contains(condition)) {
            System.out.print(userWords[i] + ",");   
         }
      }
      
      System.out.println("");
      /* Split the words into an array
      define the char
      if the word contains the char, output */
      
      
   }
}
