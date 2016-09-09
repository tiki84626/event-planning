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

}
