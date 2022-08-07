/*Given an array of integers, find the sum of its elements.
 
 Sample Input
	6
	1 2 3 4 10 11
	
 Sample Output
	31
 
 */



package hackerrank;
import java.util.Scanner;
public class Sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int n = s.nextInt();
		int arr[] = new int[1000];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			sum = sum + arr[i];
		}
		System.out.print(sum);
	}

}
