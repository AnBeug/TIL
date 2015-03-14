using System;
using System.Collections.Generic;

/** Sum of Primes
 *
 * Find the sum of all prime numbers under some upper limit.
 *
 * prime: a number that's only divisible by 1 and itself
 * 
 *  * 1 is NOT prime
 *
 * 2,3,5,7,...
 *
 **/
namespace SumOfPrimes
{
	class MainClass
	{

		ICollection<int> primes = new List<int>();


		public static void Main (string[] args)
		{
			var sumOfPrimes = new MainClass ();

			Console.WriteLine(sumOfPrimes.SumOfPrimes (4));
			Console.WriteLine(SumOfPrimes(24));
			Console.WriteLine (SumOfPrimes (100));
		}


		public int SumOfPrimes(int upperLimit) 
		{
			int sum = 0;

			for (int i = 2; i < upperLimit; i++) 
			{
				if (IsPrime(i, primes))  
				{
					primes.Add (i);
					Console.WriteLine("Adding prime: {0}", i);
					sum = sum + i;
				}
			}


			return sum; 
		}

		private static bool IsPrime(int num)
		{
			foreach (int prime in primes)
			{
				if (num % prime == 0) {
					return false;
				}
			}

			return true;
		}
	}
}