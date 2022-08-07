/*In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
 
 Sample Input
	5
	1000000001 1000000002 1000000003 1000000004 1000000005
	
 Output
	5000000015
	
 */



package hackerrank;
import java.util.Scanner;
public class A_Very_Big_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long arr[] = new long[n];
		long sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextLong();
			sum = sum + arr[i];
		}
		System.out.print(sum);

	}

}
