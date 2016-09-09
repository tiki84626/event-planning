import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
    public void newEvent_instantiatesCorrectly() {
      Event testEvent = new Event(10, "Sushi", "Beer", "Live Band");
      assertEquals(false, testEvent instanceof Event);
    }

}
