import java.util.Random;

public class Rabbit{
   private int x = -1;
   private int y = -1;
   private String rabbitName = "blank";
   Random r = new Random();
   
   public Rabbit(String rabbitName){
      this.rabbitName = rabbitName;
      x=r.nextInt(10)+1;
      y=r.nextInt(10)+1;
   }    
      
   public void getrabbitName(String rabbitName){
   this.rabbitName = rabbitName;
   }
   
   public String whatrabbitName(){
   return rabbitName;
   }
     
   public boolean isRabbitHere(int x, int y){
      return(this.x == x && this.y == y);
         
   } 
   // Move Rabbit in random direction using +-x and +-y (8 different solutions).
   public void moveRabbit (){
      int t=r.nextInt(3)-1;
      int v=r.nextInt(3)-1;
      x=x+t;
      y=y+v;
      
      if(x>10){
      x--;   
      }
      if(x<1){
      x++;
      }
      if(y>10){
      y--;   
      }
      if(y<1){
      y++;
      }      
      System.out.println(rabbitName+"Rabbit stands on: "+x+","+y);
   }
   
   // Get x and y cordinations.
   public int getRabbitX(){
      return x;
   }
   public int getRabbitY(){
      return y;
   }
    
}