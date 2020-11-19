import org.junit.Assert;
import org.junit.Test;

public class StringCalculator3Tests {

	@Test(expected = RuntimeException.class)
	public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
		StringCalculator3.add("1,2,3");
	}
	
	@Test
	public void when2NumbersAreUsedThenNoExceptionIsThrown() {
		StringCalculator3.add("1,2");
		Assert.assertTrue(true);
	}

	@Test(expected = RuntimeException.class)
	public void whenNonNumberIsUsedThenExceptionIsThrown() {
		StringCalculator3.add("1,X");
	}
	
	@Test
	public void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assert.assertEquals(0, StringCalculator3.add(""));
	}
	
	@Test
	public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Assert.assertEquals(3, StringCalculator3.add("3"));
	}
	
	@Test
	public void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Assert.assertEquals(3+6, StringCalculator3.add("3,6"));
	}



}
