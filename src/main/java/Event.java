public class Event {
  private int mGuestCount;
  private String mFoodServed;
  private String mBevServed;
  private String mEntertainment;
  private int mCost;

  public Event(int guestCount, String foodServed, String bevServed, String entertainment){
    mGuestCount = guestCount;
    mFoodServed = foodServed;
    mBevServed = bevServed;
    mEntertainment = entertainment;
    mCost = 0;
  }

  public int getCost() {
    return mCost;
  }

  public int verifyCoupons(String coupon1, String coupon2) {
    int couponCount = 0;
    if(coupon1.equals("216F&B") || coupon1.equals("780K#L")) {
      couponCount++;
    }
    if(coupon2.equals("216F&B") || coupon2.equals("780K#L")) {
      couponCount++;
    }
    return couponCount;
  }


}
