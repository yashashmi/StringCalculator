using System;
using NUnit.Framework;

namespace StringCalculator.Logic.Tests
{
    public class StringCalculator8Test
    {
        [Test]
        public void when2NumbersAreUsedThenNoExceptionIsThrown()
        {
            Assert.DoesNotThrow(() => StringCalculator8.Add("1,2"));
        }

        [Test]
        public void whenNonNumberIsUsedThenExceptionIsThrown()
        {
            Assert.Throws(typeof(FormatException), () => StringCalculator8.Add("1,x"));
        }

        [Test]
        public void whenEmptyStringIsUsedThenReturnValueIs0()
        {
            Assert.AreEqual(0, StringCalculator8.Add(""));
        }

        [Test]
        public void whenOneIsUsedThenReturnValueIsThatSameNumber()
        {
            Assert.AreEqual(3, StringCalculator8.Add("3"));
        }

        [Test]
        public void whenTwoNumbresAreUsedThenReturnValueIsTheirSum()
        {
            Assert.AreEqual(3 + 6, StringCalculator8.Add("3,6"));
        }

        [Test]
        public void whenAnyNumberOfNumbersIsUsedThenReturnValueAreTheirSums()
        {
            Assert.AreEqual(3 + 6 + 15 + 18 + 46 + 33, StringCalculator8.Add("3,6,15,18,46,33"));
        }

        [Test]
        public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums()
        {
            Assert.AreEqual(3 + 6 + 15, StringCalculator8.Add("3,6\n15"));
        }

        [Test]
        public void whenDelimeterIsSpecifiedThenItIsUsedToSeparateNumbers()
        {
            Assert.AreEqual(3 + 6 + 15, StringCalculator8.Add("//;\n3;6;15"));
        }
        [Test]
        public void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown()
        {
            TestDelegate code = () => StringCalculator8.Add("3,-6,15,-18,46,33");
            Assert.Throws(Is.TypeOf<ArgumentException>().And.Message.EqualTo("Negatives not allowed: -6,-18"), code);
        }

        [Test]
        public void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum()
        {
            Assert.AreEqual(3 + 1000 + 6, StringCalculator8.Add("3,1000,1001,6,1234"));
        }
    }
}