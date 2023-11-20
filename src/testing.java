import java.util.Scanner;
import ClassProgram2.Sorting;
public class testing {
	public static void main(String[] args) {

//RECURSIVE FUNCTION	
    int a[]= {1,2,11,40,50,6,70,8,90,100};
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value :");
    int val=s.nextInt();
    methodName(a,val,0,1);
}
	public static void methodName(int[] a,int val,int i,int j) {
		if(a.length==i) {
			return;
		}
 		else { 
 			if(a[i]>a[j]) {
				Sorting sort=new Sorting();
				sort.bubbleSort2(a);
				//methodName(a,val,i,j);
				}
				if(a[i]==val) {
					System.out.println("Lower bound:"+i);
					System.out.println("Upper bound:"+ (i+1));
				}
			else if(a[i]<val) {
			   	methodName(a,val,i+1,j+1);
			}}
		}
}

