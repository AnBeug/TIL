// ***********************************************************************
// Assembly         : Delegates
// Author           : asbeug
// Created          : 05-21-2013
//
// Last Modified By : asbeug
// Last Modified On : 05-21-2013
// ***********************************************************************
// <summary></summary>
// ***********************************************************************
using System;
using System.Collections.Generic;

namespace TIL
{
    /// <summary>
    /// Class Delegates
    /// </summary>
    public class Delegates
    {
        public static void Main()
        {
            var list = new List<String>();
            list.Add("ONE");
            list.Add("TWO");
            list.Add("THREE");
            list.Add("FOUR");

            // Display the contents of the list using the Print method.
            Print("With Print(string) as Action<T>.");
            list.ForEach(Print);

            // Create an anonymous delegate.
            Print("\nWith anonymous delegate.");
            list.ForEach(delegate(String name)
                {
                    name = string.Format("name is {0}", name);
                    Console.WriteLine(name);
                });


            // Let resharper fix up the above anonymous delegate.
            Print("\nWith anonymous delegate.");
            list.ForEach(Console.WriteLine);

            // Print with another method.
            Print("\nWith FancyPrint(string) as Action<T>.");
            list.ForEach(FancyPrint);

            // Hold the console until a key press.
            Console.ReadKey();
        }

        /// <summary>
        /// Writes the specified string to the console, but all fancy-like.
        /// </summary>
        /// <param name="s">String to print.</param>
        private static void FancyPrint(string s)
        {
            Console.WriteLine("- {0}", s);
        }

        /// <summary>
        /// Writes the specified string to the console.
        /// </summary>
        /// <param name="s">String to print.</param>
        private static void Print(string s)
        {
            Console.WriteLine(s);
        }
    }
}