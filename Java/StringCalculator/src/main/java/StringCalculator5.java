
public class StringCalculator5 {
	public static int add(String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",|\n");
		for (String number : numbersArray) {
			if (!number.isEmpty()) {

				returnValue += Integer.parseInt(number);

			}
		}

		return returnValue;
	}
}
