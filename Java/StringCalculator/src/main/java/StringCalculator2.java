
public class StringCalculator2 {
	public static int add(String numbers) {
		String[] numbersArray = numbers.split(",");
		if (numbersArray.length > 2) {
			throw new RuntimeException("Up to 2 numbers seperated by comma (,) are allowed");
		}
		for (String number : numbersArray) {
			if (!number.isEmpty()) {
				Integer.parseInt(number);
			}
		}

		return 0;
	}
}
