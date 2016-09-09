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

  // This is an attempt to create a method for running the loop.
  // public static isCorrectType(List<String> types, String type, String input) {
  //   if (!types.contains(input)) {
  //     boolean typeBoolean = false;
  //     while (!typeBoolean) {
  //       System.out.println("Please select a type of " + type + " from the above list.");
  //       String stringNewType = myConsole.readLine();
  //       if (types.contains(stringNewType)) {
  //         typeBoolean = true;
  //       }
  //     }
  //   }
  // }


}
