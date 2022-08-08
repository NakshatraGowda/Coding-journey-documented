/*
  Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. 
 Print the decimal value of each fraction on a new line with 6 places after the decimal.
 
 Sample input 1:
 	5
 	1 1 0 -1 -1
 
 Sample output 1:
 	0.400000
 	0.400000
 	0.200000
 
 */


package hackerrank;
import java.util.Scanner;
public class Plus_Minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float pos=0;
		float neg=0;
		float zero=0;
		float n = s.nextInt();
		int[] arr = new int[1000];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]>0)
			{
				pos=pos+1;
			}
			else if(arr[i]<0)
			{
				neg=neg+1;
			}
			else if(arr[i]==0)
			{
				zero=zero+1;
			}
		}
		float pans=pos/n;
		float nans=neg/n;
		float zans=zero/n;
		System.out.println(String.format("%.6f",pans));
		System.out.println(String.format("%.6f",nans));
		System.out.println(String.format("%.6f",zans));
	}

}
