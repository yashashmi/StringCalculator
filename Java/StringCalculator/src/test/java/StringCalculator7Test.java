import org.junit.Assert;
import org.junit.Test;

public class StringCalculator7Test {

	@Test
	public void when2NumbersAreUsedThenNoExceptionIsThrown() {
		StringCalculator7.add("1,2");
		Assert.assertTrue(true);
	}

	@Test(expected = RuntimeException.class)
	public void whenNonNumberIsUsedThenExceptionIsThrown() {
		StringCalculator7.add("1,X");
	}

	@Test
	public void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assert.assertEquals(0, StringCalculator7.add(""));
	}

	@Test
	public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Assert.assertEquals(3, StringCalculator7.add("3"));
	}

	@Test
	public void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Assert.assertEquals(3 + 6, StringCalculator7.add("3,6"));
	}

	@Test
	public void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
		Assert.assertEquals(3 + 6 + 15 + 18 + 46 + 33, StringCalculator7.add("3,6,15,18,46,33"));
	}

	@Test
	public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
		Assert.assertEquals(3 + 6 + 15, StringCalculator7.add("3,6\n15"));
	}

	@Test
	public void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
		Assert.assertEquals(3 + 6 + 15, StringCalculator7.add("//;\n3;6;15"));
	}

	@Test(expected = RuntimeException.class)
	public void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
		StringCalculator7.add("3,-6,15,18,46,33");
	}

	@Test
	public void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
		RuntimeException exception = null;
		try {
			StringCalculator7.add("3,-6,15,-18,46,33");
		} catch (RuntimeException e) {
			exception = e;
		}
		Assert.assertNotNull(exception);
		Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	}

}
