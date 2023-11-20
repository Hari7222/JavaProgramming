/*package Class_Program;

import java.util.Scanner;

public class vowel_or_not {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			System.out.println("Vowel");
		else
			System.out.println("Not a Vowel");
	}

}*/

//USING SWITCH CASE
package Class_Program;

import java.util.Scanner;

public class vowel_or_not {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		switch(c)
		{
		case 'a':case'A':
			//System.out.println("Vowel");
			//break;
		case 'e':case 'E':
			//System.out.println("Vowel");
			//break;
		case 'i':case'I':
			//System.out.println("Vowel");
			//break;
		case 'o':case 'O':
			//System.out.println("Vowel");
			//break;
		case 'u':case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a vowel");
		}
	}
}