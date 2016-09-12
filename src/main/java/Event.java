import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.Map;

public class Event {

  private int numberGuests;
  private String typeFood;
  private String typeDrink;
  private String typeEntertainment;
  private int totalCost;


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

  public static int calculateEventCost(int guests, String food, String drink, String entertainment) {
    Map<String, Integer> typeValues = new HashMap<String, Integer>();
    typeValues.put("Sushi", 9);
    typeValues.put("Vegan", 6);
    typeValues.put("Grill", 5);
    typeValues.put("Sandwiches", 3);
    typeValues.put("Beer", 2);
    typeValues.put("Cocktails", 3);
    typeValues.put("Soda", 1);
    typeValues.put("Live Band", 100);
    typeValues.put("DJ", 50);
    typeValues.put("None", 0);

    int totalCost = (guests * typeValues.get(food)) + (guests * typeValues.get(drink)) + typeValues.get(entertainment);

    return totalCost;
  }
}
