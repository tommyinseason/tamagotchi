public class Tamagotchi {
  private String mName;
  private Object mFood;

  public Tamagotchi(String name) {
    mName = name;
  }
  public String getName() {
    return mName;
  }
  public Tamagotchi(Object food) {
    mFood = food;
  }
  public Object getFood() {
    return mFood;
  }
}
