package linearBinarySearch;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a= {30,20,50,41,66,88,57,12,8,99,10};
		int[] b= {22,30,35,41,45,50,53,60,65,77,87,98};
		int search1=s.nextInt(),search2=s.nextInt();
		li_bi_func search=new li_bi_func();
		System.out.println("Linear Search: "+search1+" is found in the index : "+search.linear(a, search1));
		System.out.println("Binary Search: "+search2+" is found in the index : "+search.binary(b, search2));
		System.out.println("Binary Search: 77 is found in the index : "+search.binary(b));
		s.close();
	}

}
