/*Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

Example:-

a = [1, 2, 3]
b = [3, 2, 1]
For elements *0*, Bob is awarded a point because a[0] .
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.
 
Sample Input 1
	5 6 7
	3 6 10
	
Sample Output 1
	1 1
 
 */


package hackerrank;
import java.util.Scanner;
public class Compare_the_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[]=new int[100];
		int b[] = new int[100];
		int acount=0;
		int bcount=0;
		int i;
		for(i=0;i<3;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<3;i++)
		{
			b[i]=s.nextInt();
		}
		for(i=0;i<3;i++)
		{
			if(a[i]>b[i])
			{
				acount = acount +1;
			}
			else if(a[i]==b[i])
			{
				continue;
			}
			else
				bcount = bcount + 1;
		}
		System.out.print(acount+" "+bcount);
	}

}
