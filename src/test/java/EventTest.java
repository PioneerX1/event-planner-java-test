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

  @Test
  public void calculateFoodCost_forSteakOption_450() {
    Event testEvent = new Event(15, "Steak", "Wine & Beer", "DJ");
    assertEquals(450, testEvent.calculateFoodCost());
  }

  @Test
  public void calculateFoodCost_forFishOption_300() {
    Event testEvent = new Event(15, "Fish", "Wine & Beer", "DJ");
    assertEquals(300, testEvent.calculateFoodCost());
  }

  @Test
  public void calculateFoodCost_forVeggieOption_150() {
    Event testEvent = new Event(15, "Veggies", "Wine & Beer", "DJ");
    assertEquals(150, testEvent.calculateFoodCost());
  }

  @Test
  public void calculateBevCost_forFullBar_450() {
    Event testEvent = new Event(15, "Veggies", "Full Bar", "DJ");
    assertEquals(450, testEvent.calculateBevCost());
  }

  @Test
  public void calculateBevCost_forWineAndBeer_225() {
    Event testEvent = new Event(15, "Veggies", "Wine & Beer", "DJ");
    assertEquals(225, testEvent.calculateBevCost());
  }

  @Test
  public void calculateBevCost_forSoftDrinksAndJuice_75() {
    Event testEvent = new Event(15, "Veggies", "Soft Drinks & Juice", "DJ");
    assertEquals(75, testEvent.calculateBevCost());
  }

  @Test
  public void calculateEntertainmentCost_forDJ_300() {
    Event testEvent = new Event(15, "Veggies", "Full Bar", "DJ");
    assertEquals(300, testEvent.calculateEntertainmentCost());
  }

  @Test
  public void calculateEntertainmentCost_forFireBreathers_300() {
    Event testEvent = new Event(15, "Veggies", "Full Bar", "Fire Breathers");
    assertEquals(800, testEvent.calculateEntertainmentCost());
  }

  @Test
  public void calculateEntertainmentCost_forMimeFlashMob_1500() {
    Event testEvent = new Event(15, "Veggies", "Full Bar", "Mime Flash Mob");
    assertEquals(1500, testEvent.calculateEntertainmentCost());
  }

  @Test
  public void calculateTotalCost_for15VeggiesFullBarMimeFlashMob_2100() {
    Event testEvent = new Event(15, "Veggies", "Full Bar", "Mime Flash Mob");
    assertEquals(2100, testEvent.calculateTotalCost());
  }

  @Test
  public void calculateTotalCost_for100FishWineAndBeerMimeFlashMob_5000() {
    Event testEvent = new Event(100, "Fish", "Wine & Beer", "Mime Flash Mob");
    assertEquals(5000, testEvent.calculateTotalCost());
  }

  @Test
  public void calculateTotalCost_for150and2ndCouponFreeDJ_9000() {
    Event testEvent = new Event(150, "Steak", "Full Bar", "DJ");
    boolean coupon2Legit = testEvent.verifyCoupon2("780K#L");
    assertEquals(9000, testEvent.calculateTotalCost());
  }



}
