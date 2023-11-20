package Class_Program;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. elements:");
		int n=s.nextInt();//enter size of array
		int a[]=new int[n];//create array at run time
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<n;i++) {
			if(i==n-1)
				System.out.println(a[i]);
			else
			    System.out.print(a[i]+",");
		}
	}

}
