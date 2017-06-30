public class Event {
  private int mGuestCount;
  private String mFoodServed;
  private String mBevServed;
  private String mEntertainment;
  private int mCost;
  private boolean mValidCoupon1;
  private boolean mValidCoupon2;

  public Event(int guestCount, String foodServed, String bevServed, String entertainment) {
    mGuestCount = guestCount;
    mFoodServed = foodServed;
    mBevServed = bevServed;
    mEntertainment = entertainment;
    mCost = 0;
    mValidCoupon1 = false;
    mValidCoupon2 = false;
  }

  public boolean getValidCoupon2() {
    return mValidCoupon2;
  }

  public boolean getValidCoupon1() {
    return mValidCoupon1;
  }

  public String getEntertainment() {
    return mEntertainment;
  }

  public String getBevServed() {
    return mBevServed;
  }

  public String getFoodServed() {
    return mFoodServed;
  }

  public int getGuestCount() {
    return mGuestCount;
  }

  public int getCost() {
    return mCost;
  }

  public int calculateTotalCost() {
    mCost = this.calculateFoodCost() + this.calculateBevCost() + this.calculateEntertainmentCost();
    //return mCost;
    if(mValidCoupon1 == true) {
      mCost = mCost - 50;
    }
    if(mValidCoupon2 == true && mEntertainment.equals("DJ") && mGuestCount >= 150) {
      mCost = mCost - this.calculateEntertainmentCost();
    }

    return mCost;
  }

  public int calculateFoodCost() {
    if (mFoodServed.equals("Steak")) {
      return mGuestCount * 30;
    } else if (mFoodServed.equals("Fish")) {
      return mGuestCount * 20;
    } else {
      return mGuestCount * 10;
    }
  }

  public int calculateBevCost() {
    if (mBevServed.equals("Full Bar")) {
      return mGuestCount * 30;
    } else if (mBevServed.equals("Wine & Beer")) {
      return mGuestCount * 15;
    } else {
      return mGuestCount * 5;
    }
  }

  public int calculateEntertainmentCost() {
    if (mEntertainment.equals("DJ")) {
      return 300;
    } else if (mEntertainment.equals("Fire Breathers")) {
      return 800;
    } else if (mEntertainment.equals("Mime Flash Mob")) {
      return 1500;
    } else {
      return 0;
    }
  }

  public boolean verifyCoupon1(String coupon) {
    if (coupon.equals("216F&B")) {
      mValidCoupon1 = true;
      return true;
    } else { return false; }
  }

  public boolean verifyCoupon2(String coupon) {
    if (coupon.equals("780K#L")) {
      mValidCoupon2 = true;
      return true;
    } else { return false; }
  }

}
