import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
    public void newEvent_instantiatesCorrectly() {
      Event testEvent = new Event(20, "Sushi", "Beer", "Live Band");
      assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsNumberGuests_Int() {
      Event testEvent = new Event(20, "Sushi", "Beer", "Live Band");
      assertEquals(20, testEvent.getNumberGuests());
    }

    @Test
    public void newEvent_getsTypeFood_String() {
      Event testEvent = new Event(20, "Sushi", "Beer", "Live Band");
      assertEquals("Sushi", testEvent.getTypeFood());
    }

    @Test
    public void newEvent_getsTypeDrink_String() {
      Event testEvent = new Event(20, "Sushi", "Beer", "Live Band");
      assertEquals("Beer", testEvent.getTypeDrink());
    }

    @Test
    public void newEvent_getsTypeEntertainment_String() {
      Event testEvent = new Event(20, "Sushi", "Beer", "Live Band");
      assertEquals("Live Band", testEvent.getTypeEntertainment());
    }
}
