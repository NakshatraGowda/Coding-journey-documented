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
