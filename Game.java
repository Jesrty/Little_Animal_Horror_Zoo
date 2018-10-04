public class Game{

   public static void main(String[] args){
   
      int f = 0;
      int turn = 0;
   
      Rabbit rabbit1 = new Rabbit("");
      Snake snake1 = new Snake();
      Player p1 = new Player();
      
      System.out.println("Write player name: ");
      p1.skrivNavn();   
      System.out.println("Let the game begin!?!?!?!");
   
      System.out.println("Snake stands on: " + snake1.getSnakeX() + "," + snake1.getSnakeY());
      System.out.println("Rabbit stands on: " + rabbit1.getRabbitX() + "," + rabbit1.getRabbitY());
      System.out.println("Snake begin");
   
      while(f == 0){
         turn = turn+1;
         snake1.moveSnake();
         rabbit1.moveRabbit();
      
         if(snake1.getSnakeX() >= rabbit1.getRabbitX()-1 && snake1.getSnakeX() <= rabbit1.getRabbitX()+1 & snake1.getSnakeY() >= rabbit1.getRabbitY()-1 && snake1.getSnakeY() <= rabbit1.getRabbitY()+1 ){
         f=1;   
         System.out.println("Rabbit: Nooooo please don't eat me!!");
         System.out.println("Snake: Ahhhrrrrr im eating you ha ha!"); 
         System.out.println(p1.getName() + " used " + turn + " turns");
         }
      
      
      }
   
   }
}