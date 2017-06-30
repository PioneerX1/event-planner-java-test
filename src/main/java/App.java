import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("---------");
    System.out.println("Welcome to Event Planner. This application will walk you through some options and customize an event quote for your needs. First, a few questions...");
    System.out.println("---------");
    System.out.println("How many guests will your event host? ");
    int guestCount = Integer.parseInt(myConsole.readLine());
    System.out.println("We have 3 options for Food.");
    System.out.println("Press 1 for Steak.");
    System.out.println("Press 2 for Fish.");
    System.out.println("Press 3 for Veggies.");
    int choiceMealNumber = Integer.parseInt(myConsole.readLine());
    String choiceMeal = foodSelect(choiceMealNumber);
    System.out.println("We have 3 beverage options.");
    System.out.println("Press 1 for Full Cocktail Bar.");
    System.out.println("Press 2 for only Wine & Beer.");
    System.out.println("Press 3 for just Soft Drinks & Juice.");
    int choiceBevNumber = Integer.parseInt(myConsole.readLine());
    String choiceBev = bevSelect(choiceBevNumber);
    System.out.println("We have 3 entertainment options.");
    System.out.println("Press 1 for a DJ");
    System.out.println("Press 2 for Fire Breathers");
    System.out.println("Press 3 for Mime Flash Mob");
    int choiceEntNumber = Integer.parseInt(myConsole.readLine());
    String choiceEnt = entSelect(choiceEntNumber);
    //create Event object
    Event newEvent = new Event(guestCount, choiceMeal, choiceBev, choiceEnt);
    //input coupons
    System.out.println("Please enter a coupon code if you have any.");
    String code1 = myConsole.readLine();
    String code2 = "";
    if (choiceEnt.equals("DJ")) {
      System.out.println("We also have additional entertainment specials.");
      System.out.println("Please enter an Entertainment coupon if you have one");
      code2 = myConsole.readLine();
    }
    //verify coupons
    newEvent.verifyCoupon1(code1);
    newEvent.verifyCoupon2(code2);
    //calculate total event cost
    int cost = newEvent.calculateTotalCost();
    //output cost
    System.out.println("Your event will cost a total of $" + cost);




  }
  public static String foodSelect(int choice) {
    if (choice == 1) {
      return "Steak";
    } else if (choice == 2) {
      return "Fish";
    } else { return "Veggies"; }
  }
  public static String bevSelect(int choice) {
    if (choice == 1) {
      return "Full Bar";
    } else if (choice == 2) {
      return "Wine & Beer";
    } else { return "Soft Drinks & Juice"; }
  }
  public static String entSelect(int choice) {
    if (choice == 1) {
      return "DJ";
    } else if (choice == 2) {
      return "Fire Breathers";
    } else { return "Mime Flash Mob"; }
  }


}
