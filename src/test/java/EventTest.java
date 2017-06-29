import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly_true() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getCost_returnCost_0() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(0, testEvent.getCost());
  }

  @Test
  public void verifyCoupon1_NotAValidCoupon_false() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(false, testEvent.verifyCoupon1("453X&T"));
  }

  @Test
  public void verifyCoupon1_isAValidCoupon_true() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(true, testEvent.verifyCoupon1("216F&B"));
  }

  @Test
  public void verifyCoupon2_NotAValidCoupon_false() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(false, testEvent.verifyCoupon2("453X&T"));
  }

  @Test
  public void verifyCoupon2_isAValidCoupon_true() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(true, testEvent.verifyCoupon2("780K#L"));
  }



}
