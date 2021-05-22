package Day7;

/* ${@Author} created on 06.04.2021 inside the package - Day7 */
public class Main {
    public static void main(String[] args) {
       Player player1= new Player(90);
       Player player2= new Player(99);
       Player player3= new Player(92);

       Player.info();

       Player player4= new Player(96);
       Player player5= new Player(100);
       Player player6= new Player(97);

       player1.run();
       player3.run();


    }
}
