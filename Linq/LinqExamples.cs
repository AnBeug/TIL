// ***********************************************************************
// Assembly         : Linq
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
using System.Linq;

namespace TIL
{
    /// <summary>
    /// Class LinqExamples
    /// </summary>
    public class LinqExamples
    {
        public static void Main()
        {
            IEnumerable<string> list = new List<string>
            {
                "Anne Susan",
                "Alison Elizabeth",
                "Katherine Anne",
                "Catherine Ann",
                "Jennifer Anne",
                "Amy Elizabeth",
                "Carol Susan"
            };

            DoForEach(list);

            ExpressionsVersusMethods((List<string>)list);
        }

        /// <summary>
        /// ForEach can only be used on a list.
        /// You can get a list from an <see cref="IEnumerable{T}"/>,
        /// but it creates a 2nd copy of the list.
        /// </summary>
        /// <param name="theList"></param>
        private static void DoForEach(IEnumerable<string> theList)
        {
            theList.ToList<string>().ForEach(Console.WriteLine);
        }

        /// <summary>
        /// You can use linq two main ways: as query expressions
        /// or as method calls.
        /// </summary>
        public static void ExpressionsVersusMethods(List<string> list)
        {
            var newList = from name in list
                          where name.Contains("Anne")
                          select name;
            Console.WriteLine("Original List:");
            list.ForEach(delegate(string s)
                {
                    Console.WriteLine("\t{0}", s);
                });

            Console.WriteLine("Filtered List:");
            newList.ToList<string>().ForEach(delegate(string s)
                {
                    Console.WriteLine("\t{0}", s);
                });
        }


    }
}
