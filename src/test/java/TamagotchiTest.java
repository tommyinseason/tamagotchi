import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly_true() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals(true, myPet instanceof Tamagotchi);
  }
  @Test
  public void tamagotchi_getName_String() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals("lil dragon", myPet.getName());
  }
  @Test
  public void tamagotchi_getFoodLevel_int() {
    Tamagotchi myPet = new Tamagotchi(10, 10, 10);
    assertEquals(10, myPet.getFood());
  }
  @Test
  public void tamagotchi_totalHealth_int() {
    Tamagotchi myPet = new Tamagotchi(10, 10 ,10);
    assertEquals(30, myPet.getTotalHealth());
  }
  @Test
  public void tamagotchi_clickFeed_int() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.clickFeed();
    assertEquals(9, myPet.getSleep());
    assertEquals(9, myPet.getActivity());
  }
}
