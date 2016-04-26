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
  public void tamagotch_getFoodLevel_Integer() {
    Tamagotchi myPet = new Tamagotchi(10);
    assertEquals(10, myPet.getFood());
  }
}
