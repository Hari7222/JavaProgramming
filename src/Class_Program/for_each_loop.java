package Class_Program;

public class for_each_loop {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		String s[]= {"one","two","Three"};
		System.out.println("for loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println("\nFor each loop");
		for(int z:a)//z=declaration,a=expression
		{
			System.out.print(z+" ");
		}
		for(String z:s)
		{
			System.out.print(z+" ");
		}
			}

}
