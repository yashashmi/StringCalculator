using System;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator3
    {
        public static int Add(string numbers)
        {
            int returnValue = 0;
            var numbersArray = numbers.Split(',');
            if (numbersArray.Length > 2)
            {
                throw new ArgumentException();
            }
            foreach (var number in numbersArray)
            {
                if (!number.Equals(string.Empty))
                    returnValue += Int16.Parse(number);
            }

            return returnValue;
        }
    }
}