import org.junit.Assert;
import org.junit.Test;

public class StringCalculator4Tests {

	@Test
	public void when2NumbersAreUsedThenNoExceptionIsThrown() {
		StringCalculator4.add("1,2");
		Assert.assertTrue(true);
	}

	@Test(expected = RuntimeException.class)
	public void whenNonNumberIsUsedThenExceptionIsThrown() {
		StringCalculator4.add("1,X");
	}
	
	@Test
	public void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assert.assertEquals(0, StringCalculator4.add(""));
	}
	
	@Test
	public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Assert.assertEquals(3, StringCalculator4.add("3"));
	}
	
	@Test
	public void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Assert.assertEquals(3+6, StringCalculator4.add("3,6"));
	}
	
	@Test
	public void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
		Assert.assertEquals(3+6+15+18+46+33, StringCalculator4.add("3,6,15,18,46,33"));
	}


}
