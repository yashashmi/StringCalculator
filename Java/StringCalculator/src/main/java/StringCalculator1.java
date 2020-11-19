
public class StringCalculator1 {

	public static void add(String numbers) {
		String[] numbersArray = numbers.split(",");
		if (numbersArray.length > 2) {
			throw new RuntimeException("Up to 2 numbers seperated by comma (,) are allowed");
		}
		for (String number : numbersArray) {
			Integer.parseInt(number);
		}
	}

}
