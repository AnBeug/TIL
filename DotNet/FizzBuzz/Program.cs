using System;

namespace FizzBuzz
{
    /// <summary>
    /// Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead 
    /// of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both 
    /// three and five print “FizzBuzz”.
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i <= 100; i++)
            {
                string output = i.ToString();

                if (i % 3 == 0 && i % 5 == 0)
                {
                    output = "FizzBuzz";
                }
                else if (i % 3 == 0)
                {
                    output = "Fizz";
                }
                else if (i % 5 == 0)
                {
                    output = "Buzz";
                }

                Console.WriteLine("{0}:   {1}", i, output);
            }

            Console.ReadKey();
        }
    }
}
