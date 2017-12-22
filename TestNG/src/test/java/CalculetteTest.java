import org.cours.testNG.Calculette;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculetteTest {
  @Test(groups= {"groupe1"})
  public void add() {
	  Calculette calc=new Calculette();
	  Assert.assertEquals(calc.add(12.0, 8.0), 20.0);
  }
  
  @Test
  public void multiply() {
	  Calculette calc=new Calculette();
	  Assert.assertEquals(calc.multiply(1.0, 8.0), 8.0);
  }
  
@Test(groups= {"groupe1"})
  public void soustaire() {
	  Calculette calc=new Calculette();
	  Assert.assertEquals(calc.soustraire(12.0, 8.0), 4.0);
  }
  
  @Test
  public void division() {
	  Calculette calc=new Calculette();
	  Assert.assertEquals(calc.division(8.0, 8.0), 1.0);
  }
}
