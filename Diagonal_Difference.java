/*
 
 Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = 1 + 5 + 9. The right to left diagonal = 3 + 5 + 9 . Their absolute difference is |15 - 17| = 2.

Sample input 1
	3
	11 2 4
	4 5 6
	10 8 -12
	
Sample output 1
	15
	
 */

import java.util.Scanner;
import java.lang.*;
public class Diagonal_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i;
		int j;
		int n = s.nextInt();
		int arr[][]=new int[100][100];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int rd = 0;
		int ld = 0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					rd = rd + arr[i][j];
				}
				else
					continue;
			}
		}
		
		i=0;
		j=n-1;
		while(i<n && j>=0)
		{
			ld = ld + arr[i][j];
			i++;
			j--;
		}
		
		int diff = rd-ld;
		System.out.print(Math.abs(diff));
	}

}
