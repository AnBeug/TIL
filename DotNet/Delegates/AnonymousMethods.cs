// ***********************************************************************
// Assembly         : Delegates
// Author           : asbeug
// Created          : 05-21-2013
//
// Last Modified By : asbeug
// Last Modified On : 05-21-2013
// ***********************************************************************
// <summary>
// For more reference:
// http://msdn.microsoft.com/en-us/library/0yw3tz5k.aspx
// </summary>
// ***********************************************************************

using System;

namespace TIL
{
    /// <summary>
    /// Class AnonymousMethods
    /// </summary>
    public class AnonymousMethods
    {
        /// <summary>
        /// Declare the delegate type. Any method assigned to this delegate will have to have the same method signature
        /// </summary>
        /// <param name="x">The x.</param>
        /// <returns>System.Int32.</returns>
        private delegate int DelegateType(int x);

        /// <summary>
        /// Mains this instance.
        /// </summary>
        public static void Main()
        {
            Simple();
            OuterVariables();
        }

        private static void Simple()
        {
            // Instantiate the delegate using an anonymous method.
            DelegateType d = delegate(int k)
                {
                    int i = k * 3;
                    return i;
                };

            // Now use it.
            int l = 2;
            int j = d(l);
            Console.WriteLine("d({0}) = {1}", l, j);

            l = 3;
            j = d(l);
            Console.WriteLine("d({0}) = {1}", l, j);
        }

        private static void OuterVariables()
        {
            int outerNum = 2;
            Console.WriteLine("Outer num (from before): {0}", outerNum);
            DelegateType d = delegate(int k)
                {
                    outerNum = outerNum + k;
                    Console.WriteLine("Outer num (from inside):{0}", outerNum);
                    return k;
                };
            int k2 = d(2);
            Console.WriteLine("Outer num (from after): {0}", outerNum);
        }
    }
}
