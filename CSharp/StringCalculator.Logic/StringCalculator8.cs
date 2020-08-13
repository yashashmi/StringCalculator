using System;
using System.Collections;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator8
    {
        public static int Add(string numbers)
        {
            string delimiter = ",|\n";
            string numbersWithoutDelimiter = numbers;
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
            var negativeNumbers = new ArrayList();
            foreach (var number in numbersArray)
            {

                if (!number.Equals(string.Empty))
                {
                    var intNumber = Int16.Parse(number);
                    if (intNumber < 0)
                    {
                        negativeNumbers.Add(number);
                    }
                    else if (intNumber <= 1000)
                    {
                        returnValue += intNumber;
                    }
                }
            }
            if (negativeNumbers.Count > 0)
            {
                throw new ArgumentException("Negatives not allowed: " + String.Join(",", negativeNumbers.ToArray()));
            }
            return returnValue;
        }
    }
}