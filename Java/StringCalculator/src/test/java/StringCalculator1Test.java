import org.junit.Test;

public class StringCalculator1Test {

	@Test(expected = RuntimeException.class)
	public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
		StringCalculator1.add("1,2,3");
	}
	
	@Test
	public void when2NumbersAreUsedThenNoExceptionIsThrown() {
		StringCalculator1.add("1,3");
		
	}
	
	@Test(expected = RuntimeException.class)
	public void whenNonNumberIsUsedThenExceptionIsThrown() {
		StringCalculator1.add("1,x");
	}

}
