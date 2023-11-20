package Class_Program;
import java.util.Scanner;
public class Array_odd_number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter the no. elements:");
		int n=s.nextInt();//enter size of 
		//System.out.println("Enter the numbers:");
		int a[]=new int[n];//create array at run time
		int odd[]=new int[n];//odd[]={0,0,0,0,0} it assignes according to the n input 
		int even[]=new int[n];
		int even_index=0,odd_index=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==0)
		       even[even_index++]=a[i];
			else
				odd[odd_index++]=a[i];}
		System.out.print("Odd:");
		for(int i=0;i<odd_index;i++) {//for(int i=0;i<n;i++)
			//if(odd[i]!=0)
			System.out.print(odd[i]+" ");}
		System.out.print("\nEven:");
		for(int i=0;i<even_index;i++) {//for(int i=0;i<n;i++)
			//if(even[i]!=0)
			System.out.print(even[i]+" ");}	
		}
	}