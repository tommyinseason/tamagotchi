public class Tamagotchi {

  private String mName;
  private int mFood = 10;
  private int mSleep = 10;
  private int mActivity = 10;
  private int mTotalHealth;

  public Tamagotchi(String name) {
    mName = name;
  }
  public String getName() {
    return mName;
  }
  public Tamagotchi(int food, int sleep, int activity) {
    mFood = food;
    mSleep = sleep;
    mActivity = activity;
  }
  public int getFood() {
    return mFood;
  }
  public int getSleep() {
    return mSleep;
  }
  public int getActivity() {
    return mActivity;
  }
  public int getTotalHealth() {
    mTotalHealth = (mFood + mSleep + mActivity);
    return mTotalHealth;
  }
  public int clickFeed(){
    mFood++;
    mSleep--;
    mActivity--;
    return mFood;
  }
  public int clickSleep(){
    mFood--;
    mSleep++;
    mActivity--;
    return mSleep;
  }
  public int clickActivity(){
    mFood--;
    mSleep--;
    mActivity++;
    return mActivity;
  }


}
