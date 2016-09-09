import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("How many people are going to be coming to your event?");
    String stringNumberGuests = myConsole.readLine();
    int numberGuests = Integer.parseInt(stringNumberGuests);


  }
}
