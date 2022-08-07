
import java.util.Scanner;
public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int temp;
		int a[]=new int[100];
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
		System.out.print(a[i]+" ");
		}
	}

}
