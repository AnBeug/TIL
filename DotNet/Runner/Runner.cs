﻿// ***********************************************************************
// Assembly         : Runner
// Author           : asbeug
// Created          : 05-21-2013
//
// Last Modified By : asbeug
// Last Modified On : 05-21-2013
// ***********************************************************************
// <summary></summary>
// ***********************************************************************
using System;

namespace TIL
{
    /// <summary>
    /// Class Program
    /// </summary>
    class Program
    {
        /// <summary>
        /// Defines the entry point of the application.
        /// </summary>
        /// <param name="args">The args.</param>
        static void Main(string[] args)
        {
            Console.WriteLine("About to get this started...");

            Console.WriteLine("---- DELEGATES  ----------");
            Delegates.Main();

            Console.WriteLine("---- ANONYMOUS DELEGATES -");
            AnonymousMethods.Main();

            Console.WriteLine("---- LINQ ----------------");
            LinqExamples.Main();

            // Hold the console until a key press.
            Console.ReadKey();
        }
    }
}
