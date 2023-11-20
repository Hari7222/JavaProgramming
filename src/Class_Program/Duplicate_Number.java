
/*package Class_Program;
import java.util.Scanner;
public class Duplicate_Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j])
					System.out.print(a[j]+" ");
			}
		}
		s.close();
	}
}*/
//REMOVE DUPLICATE ELEMENTS
package Class_Program;
import java.util.Scanner;
public class Duplicate_Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int replaceindex=0,flag,j;
		int a[]=new int[n];
		int temp[]=new int[n];
	    for(int i=0;i<n;i++) {
		a[i]=s.nextInt();}
	    temp[replaceindex++]=a[0];
		for(int i=0;i<n;i++) {
			flag=0;
			for(j=i+1;j<n;j++) {
				if(a[j]!=a[i]) {
					break;
				}}
			for(int k=0;k<replaceindex;k++) {
				if(temp[k]==a[i])
					flag=1;
			}
			if(flag==0)
				temp[replaceindex++]=a[i];
			i=j-1;
			}
		for(int i=0;i<replaceindex;i++)
		{
			System.out.print(temp[i]+" ");
		}
		s.close();
	}}
