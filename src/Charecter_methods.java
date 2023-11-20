/*public class Charecter_methods {
	public static void main(String[] args) {
		System.out.println("java\tprog");
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isLetter('5'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toString('l'));
		String s="hari";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+"\t");	
	}
}*/

/*TEST CASE:
 * INPUT:hello123
 * OUTPUT:
 * Alphabets:5
 * Digits:3*/

import java.util.Scanner;
public class Charecter_methods {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		int a=0,d=0;
		char c[]=str.toCharArray();
		for(int i=0;i<=c.length;i++) {
			System.out.println(c[i]);
			//System.out.println(Character.isLetter(c[i]));
			if(Character.isLetter(c[i])) 
				a++;
			else if(Character.isDigit(c[i])) 
				d++;
		}
		System.out.println("Alphabet:"+a);
		System.out.println("Digit:"+d);
				
		}
	}

