using System;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator2
    {
        public static int Add(string numbers)
        {
            var numbersArray = numbers.Split(',');
            if (numbersArray.Length > 2)
            {
                throw new ArgumentException();
            }
            foreach (var number in numbersArray)
            {
                if (!number.Equals(string.Empty))
                    Int16.Parse(number);
            }

            return 0;
        }
    }
}