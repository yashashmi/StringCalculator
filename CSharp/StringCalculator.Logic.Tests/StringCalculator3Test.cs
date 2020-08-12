using System;
using NUnit.Framework;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator3Test
    {
        [Test]
        public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown()
        {
            Assert.Throws(typeof(ArgumentException), () => StringCalculator3.Add("1,2,3"));
        }

        [Test]
        public void when2NumbersAreUsedThenNoExceptionIsThrown()
        {
            Assert.DoesNotThrow(() => StringCalculator3.Add("1,2"));
        }

        [Test]
        public void whenNonNumberIsUsedThenExceptionIsThrown()
        {
            Assert.Throws(typeof(FormatException), () => StringCalculator3.Add("1,x"));
        }

        [Test]
        public void whenEmptyStringIsUsedThenReturnValueIs0()
        {
            Assert.AreEqual(0, StringCalculator3.Add(""));
        }

        [Test]
        public void whenOneIsUsedThenReturnValueIsThatSameNumber()
        {
            Assert.AreEqual(3, StringCalculator3.Add("3"));
        }

        [Test]
        public void whenTwoNumbresAreUsedThenReturnValueIsTheirSum()
        {
            Assert.AreEqual(3 + 6, StringCalculator3.Add("3,6"));
        }
    }
}