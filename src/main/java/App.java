import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("How many people are going to be coming to your event?");
    String stringNumberGuests = myConsole.readLine();
    int numberGuests = Integer.parseInt(stringNumberGuests);

    System.out.println("What type of food would you like to serve at your event? Choose from the following: Sushi, Vegan, Grill, or Sandwiches.");
    String stringTypeFood = myConsole.readLine();
    List<String> typesFood = asList("Sushi", "Vegan", "Grill", "Sandwiches");

    if (!typesFood.contains(stringTypeFood)) {
      boolean typeOfFood = false;
      while (!typeOfFood) {
        System.out.println("Please select a type of food from the above list.");
        String stringNewFood = myConsole.readLine();
        if (typesFood.contains(stringNewFood)) {
          typeOfFood = true;
        }
      }
    }
    // I want to creat a method for running this loop but can't get it working!
    // isCorrectType(typesFood, "food", stringTypeFood);


    System.out.println("What type of drinks would you like to serve at your event? Choose from the following: Beer, Cocktails, or Soda.");
    String stringTypeDrink = myConsole.readLine();
    List<String> typesDrink = asList("Beer", "Cocktails", "Soda");

    if (!typesDrink.contains(stringTypeDrink)) {
      boolean typeOfDrink = false;
      while (!typeOfDrink) {
        System.out.println("Please select a type of food from the above list.");
        String stringNewFood = myConsole.readLine();
        if (typesFood.contains(stringNewFood)) {
          typeOfFood = true;
        }
      }
    }

    System.out.println("What type of entertainment would you like to have at your event? Please choose one of the following: Live Band, DJ, or None");
    String stringTypeEntertainment = myConsole.readLine();



    Event userEvent = new Event(numberGuests, stringTypeFood, stringTypeDrink, stringTypeEntertainment);

  }
}
