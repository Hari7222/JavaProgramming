package Class_Program;
import java.util.Scanner;
public class Largenuminarray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//temp[]=new int[n],j=0;
		int a[]=new int[n],max=a[0];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=1;i<n;i++) {
			if(a[i]>max)
				max=a[i];}
					System.out.println(max);
			
		}
	}


