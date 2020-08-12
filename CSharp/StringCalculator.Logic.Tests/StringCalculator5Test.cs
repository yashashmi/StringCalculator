using System;
using NUnit.Framework;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator5Test
    {
        [Test]
        public void when2NumbersAreUsedThenNoExceptionIsThrown()
        {
            Assert.DoesNotThrow(() => StringCalculator5.Add("1,2"));
        }

        [Test]
        public void whenNonNumberIsUsedThenExceptionIsThrown()
        {
            Assert.Throws(typeof(FormatException), () => StringCalculator5.Add("1,x"));
        }

        [Test]
        public void whenEmptyStringIsUsedThenReturnValueIs0()
        {
            Assert.AreEqual(0, StringCalculator5.Add(""));
        }

        [Test]
        public void whenOneIsUsedThenReturnValueIsThatSameNumber()
        {
            Assert.AreEqual(3, StringCalculator5.Add("3"));
        }

        [Test]
        public void whenTwoNumbresAreUsedThenReturnValueIsTheirSum()
        {
            Assert.AreEqual(3 + 6, StringCalculator5.Add("3,6"));
        }

        [Test]
        public void whenAnyNumberOfNumbersIsUsedThenReturnValueAreTheirSums()
        {
            Assert.AreEqual(3 + 6 + 15 + 18 + 46 + 33, StringCalculator5.Add("3,6,15,18,46,33"));
        }

        [Test]
        public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums()
        {
            Assert.AreEqual(3 + 6 + 15, StringCalculator5.Add("3,6\n15"));
        }
    }
}