using System;
using NUnit.Framework;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator1Test
    {
        [Test]
        public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown()
        {
            Assert.Throws(typeof(ArgumentException), () => StringCalculator1.Add("1,2,3"));
        }

        [Test]
        public void when2NumbersAreUsedThenNoExceptionIsThrown()
        {
            Assert.DoesNotThrow(() => StringCalculator1.Add("1,2"));
        }

        [Test]
        public void whenNonNumberIsUsedThenExceptionIsThrown()
        {
            Assert.Throws(typeof(FormatException), () => StringCalculator1.Add("1,x"));
        }
    }
}