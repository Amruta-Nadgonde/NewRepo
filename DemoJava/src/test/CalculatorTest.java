package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {
  @Test
  public void addTest() {
	  int a = 7;
	  int b=10;
	  int expres = 17;
	  int actres = Calculator.add(a, b);
	  assertEquals(actres, expres);
  }
  
  @Test
  public void mulTest() {
	  Calculator cal = new Calculator();
	  int a = 7;
	  int b=10;
	  int expres = 70;
	  int actres = cal.multiply(a, b);
	  assertEquals(actres, expres);
  }
}
