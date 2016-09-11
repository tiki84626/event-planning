import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class Event {

  private int numberGuests;
  private String typeFood;
  private String typeDrink;
  private String typeEntertainment;


  public Event(int guests, String food, String drink, String entertainment) {
    numberGuests = guests;
    typeFood = food;
    typeDrink = drink;
    typeEntertainment = entertainment;
  }

  public int getNumberGuests() {
    return numberGuests;
  }

  public String getTypeFood() {
    return typeFood;
  }

  public String getTypeDrink() {
    return typeDrink;
  }

  public String getTypeEntertainment() {
    return typeEntertainment;
  }

  public static String isCorrectType(List<String> types, String type, String input) {
    Console myConsole = System.console();
    if (!types.contains(input)) {
      boolean typeBoolean = false;
      while (!typeBoolean) {
        System.out.println("Please select a type of " + type + " from the above list.");
        input = myConsole.readLine();
        if (types.contains(input)) {
          typeBoolean = true;
        }
      }
    }
    return input;
  }


}
