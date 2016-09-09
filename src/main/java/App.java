import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();


    System.out.println("How many people are going to be coming to your event?");
    String stringNumberGuests = myConsole.readLine();
    int numberGuests = Integer.parseInt(stringNumberGuests);

    System.out.println("What type of food would you like to serve at your event? Choose from the following: Sushi, Vegan, Grill, or Sandwiches.");
    String stringTypeFood = myConsole.readLine();

    System.out.println("What type of drinks would you like to serve at your event? Choose from the following: Beer, Cocktails, or Soda.");
    String stringTypeDrink = myConsole.readLine();

    System.out.println("What type of entertainment would you like to have at your event? Please choose one of the following: Live Band, DJ, or None");
    String stringTypeEntertainment = myConsole.readLine();

    Event userEvent = new Event(numberGuests, stringTypeFood, stringTypeDrink, stringTypeEntertainment);

    
  }
}
