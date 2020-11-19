import org.junit.Assert;
import org.junit.Test;

public class StringCalculator6Test {

	@Test
	public void when2NumbersAreUsedThenNoExceptionIsThrown() {
		StringCalculator6.add("1,2");
		Assert.assertTrue(true);
	}

	@Test(expected = RuntimeException.class)
	public void whenNonNumberIsUsedThenExceptionIsThrown() {
		StringCalculator6.add("1,X");
	}

	@Test
	public void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assert.assertEquals(0, StringCalculator6.add(""));
	}

	@Test
	public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Assert.assertEquals(3, StringCalculator6.add("3"));
	}

	@Test
	public void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Assert.assertEquals(3 + 6, StringCalculator6.add("3,6"));
	}

	@Test
	public void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
		Assert.assertEquals(3 + 6 + 15 + 18 + 46 + 33, StringCalculator6.add("3,6,15,18,46,33"));
	}

	@Test
	public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
		Assert.assertEquals(3 + 6 + 15, StringCalculator6.add("3,6\n15"));
	}
	
	@Test
	public void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
		Assert.assertEquals(3+6+15, StringCalculator6.add("//;\n3;6;15"));
	}


}
