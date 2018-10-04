import java.util.Scanner;
public class Snake{

   private int x = 5;
   private int y = 5;
   
   Scanner s = new Scanner(System.in);
   
   public int getSnakeX(){
      return x;
   }
   
   public int getSnakeY(){
      return y;
   }
   
   public void moveSnake(){
      int imp = s.nextInt();
   
      if ((imp==1 || imp==4 || imp==7) && x>1){
         x--;
      }
      if ((imp==3 || imp==6 || imp==9) && x<10){
         x++;
      }
      if ((imp==7 || imp==8 || imp==9) && y<10){
         y++;
      }
      if ((imp==1 || imp==2 || imp==3) && y>1){
         y--;      
      }
      
      System.out.println("Snake Stands on: "+x+","+y);
   }
}