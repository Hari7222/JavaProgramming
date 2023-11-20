import java.util.Scanner;
public class Mixed_SEries {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int odd=1,b=1,even=0,a=1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				System.out.print(odd+" ");
				odd+=2;
			}
			else {
				if(i==1||i==3)
					System.out.print(b+" ");
				else {
				even=a+b;
	        	System.out.print(even+" ");
	        	a=b;
	        	b=even;
				}
			}
		}
	}
}
