/*
  You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. 
  They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
  
  Example
  candles=[4,4,1,3]
  The maximum height of a candle is 4 units high. There are 2 of them. Hence, return 2.
  
  Sample input
  4
  3 1 2 3
  
  Sample output
  2
  
  */
package hackerrank;
import java.util.Scanner;
public class birthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long arr[]=new long[100000];
		long n=s.nextLong();
		int i;
		int count=0;
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextLong();
		}
		long max=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				count++;
			}
		}
		System.out.print(count);
}
}
