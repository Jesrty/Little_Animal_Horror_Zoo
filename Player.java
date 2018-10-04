import java.util.Scanner;
public class Player{

   private String name;
   Scanner s = new Scanner(System.in);
   
   public void skrivNavn(){
      name = s.nextLine();
   }

   public String getName(){
      return name;
   }

}