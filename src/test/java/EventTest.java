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
  public void verifyCoupons_noValidCouponCodes_0() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(0, testEvent.verifyCoupons("27GH$X" , "45NH$V"));
  }

  @Test
  public void verifyCoupons_oneValidCouponCode_1() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(1, testEvent.verifyCoupons("27GH$X" , "780K#L"));
  }

  @Test
  public void verifyCoupons_twoValidCouponCode_2() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(2, testEvent.verifyCoupons("216F&B" , "780K#L"));
  }


}
