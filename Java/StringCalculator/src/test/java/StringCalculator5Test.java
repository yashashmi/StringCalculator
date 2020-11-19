import org.junit.Assert;
import org.junit.Test;

public class StringCalculator5Test {

	@Test
	public void when2NumbersAreUsedThenNoExceptionIsThrown() {
		StringCalculator5.add("1,2");
		Assert.assertTrue(true);
	}

	@Test(expected = RuntimeException.class)
	public void whenNonNumberIsUsedThenExceptionIsThrown() {
		StringCalculator5.add("1,X");
	}
	
	@Test
	public void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assert.assertEquals(0, StringCalculator5.add(""));
	}
	
	@Test
	public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Assert.assertEquals(3, StringCalculator5.add("3"));
	}
	
	@Test
	public void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Assert.assertEquals(3+6, StringCalculator5.add("3,6"));
	}
	
	@Test
	public void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
		Assert.assertEquals(3+6+15+18+46+33, StringCalculator5.add("3,6,15,18,46,33"));
	}
	
	@Test
	public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
			Assert.assertEquals(3+6+15, StringCalculator5.add("3,6\n15"));
		}


}
