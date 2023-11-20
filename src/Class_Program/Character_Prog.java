/*package Class_Program;
import java.util.Scanner;
public class Character_Prog {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		int a=0,d=0;
		char c[]=str.toCharArray();
		for(int i=0;i<=c.length;i++) {
			//System.out.print(c[i]);
			//System.out.println(Character.isLetter(c[i]));
			if(Character.isLetter(c[i])) {
				a++;}
			else if(Character.isDigit(c[i])) {
				d++;}
		}
		System.out.println("Alphabet:"+a);
		System.out.println("Digit:"+d);
				
		}
	}*/
/*Test case:
	i/p:Hello World
	o/p:World Hello*/

package Class_Program;
import java.util.Scanner;
public class Character_Prog {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
		System.out.println(str1[1]+" "+str1[0]);
	}
}
