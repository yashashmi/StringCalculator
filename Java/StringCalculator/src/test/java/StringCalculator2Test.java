import org.junit.Assert;
import org.junit.Test;

public class StringCalculator2Test {

	@Test(expected = RuntimeException.class)
	public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
		StringCalculator2.add("1,2,3");
	}
	
	@Test
	public void when2NumbersAreUsedThenNoExceptionIsThrown() {
		StringCalculator2.add("1,2");
		Assert.assertTrue(true);
	}

	@Test(expected = RuntimeException.class)
	public void whenNonNumberIsUsedThenExceptionIsThrown() {
		StringCalculator2.add("1,X");
	}
	
	@Test
	public void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assert.assertEquals(0, StringCalculator2.add(""));
	}


}
