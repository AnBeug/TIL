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
        public void Main()
        {
            // Instantiate the delegate using an anonymous method.
            DelegateType d = delegate(int k)
                {
                    int i = k * 3;
                    return i;
                };

            int l = 2;
            int j = d(l);
            Console.WriteLine("d({0}) = {1}", l, j);

            l = 3;
            j = d(l);
            Console.WriteLine("d({0}) = {1}", l, j);
        }
    }
}
