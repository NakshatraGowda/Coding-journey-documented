/*Problem statement - 
 Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
 
 Sample Input 1:
	3 3
	1 2 3
	4 5 6
	7 8 9
	
  Sample Output 1 :
	1 2 3
	1 2 3
	1 2 3
	4 5 6
	4 5 6
	7 8 9
 
 */



package hackerrank;
import java.util.Scanner;
public class Array_2D {
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			int arr[][]=new int[100][100];
			int n = s.nextInt();
			int m = s.nextInt();
			int i;
			int j;
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					arr[i][j]=s.nextInt();				
				}
			}
			
			i=0;
			while(n>0) {
				int count =0;
					while (n>count)
					{
						//for(i=0;i<n;i++)
						//{
						for(j=0;j<m;j++)
						{
							System.out.print(arr[i][j] + " ");
						}
						System.out.println();
						count++;
						//}
					}
					n--;
					i++;
			}
		}
		
		}
