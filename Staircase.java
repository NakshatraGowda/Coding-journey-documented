/*Staircase detail

This is a staircase of size :

   #
  ##
 ###
####
Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

Sample input
4

sample output
   #
  ##
 ###
####
*/


import java.util.Scanner;
public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[100][100];
		Scanner s = new Scanner(System.in);
		int i;
		int j;
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-(i+1);j++)
			{
				System.out.print(" ");
			}
			for(j=n-(i+1);j<n;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
