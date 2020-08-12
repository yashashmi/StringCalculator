using System;

namespace StringCalculator.Logic
{
    public class StringCalculator1
    {
        public static void Add(string numbers)
        {
            var numbersArray = numbers.Split(',');
            if (numbersArray.Length > 2)
            {
                throw new ArgumentException();
            }
            foreach(var number in numbersArray)
            {
                Int16.Parse(number);
            }
        }
    }
}
