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
        IList<string> list = new List<string>
            {
                "One",
                "Two",
                "Three",
                "Four"
            };
        }

        /// <summary>
        /// ForEach can only be used on a list.
        /// </summary>
        /// <param name="theList"></param>
        private void DoForEach(List<string> theList)
        {
            theList.ForEach(delegate
                {

                });
        }
    }
}
