/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
 Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 
 Sample input
 1 2 3 4 5
 
 Sample output
 10 14
 
 */

import java.util.Scanner;
public class miniMaxSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        long arr[]=new long[5];
        int i;
        long sum=0;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        long min=arr[0];
        long max=arr[4];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print((sum-max)+" "+(sum-min));
        
    }

}
