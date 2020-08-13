using System;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator6
    {
        public static int Add(string numbers)
        {
            String delimiter = ",|\n";
            String numbersWithoutDelimiter = numbers;
            if (numbers.StartsWith("//"))
            {
                int delimiterIndex = numbers.IndexOf("//") + 2;
                delimiter = numbers.Substring(delimiterIndex, 1);
                numbersWithoutDelimiter = numbers.Substring(numbers.IndexOf("\n") + 1);
            }
            return Add(numbersWithoutDelimiter, delimiter);
        }

        private static int Add(string numbers, string delimiter)
        {
            int returnValue = 0;
            var numbersArray = numbers.Split(delimiter.ToCharArray());
            foreach (var number in numbersArray)
            {
                if (!number.Equals(string.Empty))
                    returnValue += Int16.Parse(number);
            }

            return returnValue;
        }
    }
}