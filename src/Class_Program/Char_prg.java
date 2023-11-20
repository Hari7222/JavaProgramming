package Class_Program;
import java.util.Scanner;
public class Char_prg {
	public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				String str;
				str=s.nextLine();
				int a=0,d=0,v=0,con=0,sp=0,ws=0;
				char c[]=str.toCharArray();
				for(int i=0;i<c.length;i++) {
					//System.out.print(c[i]+"\t");
					if(Character.isLetter(c[i])) {
						a++;
					if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'
							||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
						v++;
					else
						con++;}
					 if(Character.isDigit(c[i])) 
							d++;
					 if(Character.isWhitespace(c[i]))
							ws++;
					else
						sp++;
					}
				System.out.println("Alphabet:"+a);
				System.out.println("Digit:"+d);
				System.out.println("Vowels:"+v);
				System.out.println("Consonents"+con);
				System.out.println("White Space"+ws);
				System.out.println("Special Character"+sp);
				}
			}