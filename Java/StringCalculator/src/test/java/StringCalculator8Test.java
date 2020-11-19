import org.junit.Assert;
import org.junit.Test;

public class StringCalculator8Test {

	@Test
	public void when2NumbersAreUsedThenNoExceptionIsThrown() {
		StringCalculator8.add("1,2");
		Assert.assertTrue(true);
	}

	@Test(expected = RuntimeException.class)
	public void whenNonNumberIsUsedThenExceptionIsThrown() {
		StringCalculator8.add("1,X");
	}

	@Test
	public void whenEmptyStringIsUsedThenReturnValueIs0() {
		Assert.assertEquals(0, StringCalculator8.add(""));
	}

	@Test
	public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
		Assert.assertEquals(3, StringCalculator8.add("3"));
	}

	@Test
	public void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
		Assert.assertEquals(3 + 6, StringCalculator8.add("3,6"));
	}

	@Test
	public void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
		Assert.assertEquals(3 + 6 + 15 + 18 + 46 + 33, StringCalculator8.add("3,6,15,18,46,33"));
	}

	@Test
	public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
		Assert.assertEquals(3 + 6 + 15, StringCalculator8.add("3,6\n15"));
	}

	@Test
	public void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
		Assert.assertEquals(3 + 6 + 15, StringCalculator8.add("//;\n3;6;15"));
	}

	@Test(expected = RuntimeException.class)
	public void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
		StringCalculator8.add("3,-6,15,18,46,33");
	}

	@Test
	public void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
		RuntimeException exception = null;
		try {
			StringCalculator8.add("3,-6,15,-18,46,33");
		} catch (RuntimeException e) {
			exception = e;
		}
		Assert.assertNotNull(exception);
		Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	}

	@Test
	public void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
		Assert.assertEquals(3 + 1000 + 6, StringCalculator8.add("3,1000,1001,6,1234"));
	}

}
