using System;
using NUnit.Framework;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator2Test
    {
        [Test]
        public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown()
        {
            Assert.Throws(typeof(ArgumentException), () => StringCalculator2.Add("1,2,3"));
        }

        [Test]
        public void when2NumbersAreUsedThenNoExceptionIsThrown()
        {
            Assert.DoesNotThrow(() => StringCalculator2.Add("1,2"));
        }

        [Test]
        public void whenNonNumberIsUsedThenExceptionIsThrown()
        {
            Assert.Throws(typeof(FormatException), () => StringCalculator2.Add("1,x"));
        }

        [Test]
        public void whenEmptyStringIsUsedThenReturnValueIs0()
        {
            Assert.AreEqual(0, StringCalculator2.Add(""));
        }
    }
}