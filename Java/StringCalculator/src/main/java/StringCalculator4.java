
public class StringCalculator4 {
	public static int add(String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",");
//		if (numbersArray.length > 2) {
//			throw new RuntimeException("Up to 2 numbers seperated by comma (,) are allowed");
//		}
		for (String number : numbersArray) {
			if (!number.isEmpty()) {

				returnValue += Integer.parseInt(number);

			}
		}

		return returnValue;
	}
}
