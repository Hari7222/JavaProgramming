package Class_Program;
import java.util.Scanner;
public class Multiple_Occurance_of_num {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}System.out.print("Enter the element to Search the number of occurance:");
		int count=0,search=s.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==search)
				count++;
		}
		if(count>0)
			System.out.println("Total Occurance of "+search+"="+count);
		else
			System.out.println("There is no Occurance of "+search);
		
	}

}
