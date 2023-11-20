//PROGRAM TO ADD TWO NUMBERS
/*public class First {

	public static void main(String[] args) {
        System.out.println(10+20);
        long a=898989859,b=78;
        System.out.println("Addition="+(a+b)); //+ is for concatenation 
        float f=90;
        double h=88.8;
        String s="hari";
        boolean bool=true;
        System.out.println("Float="+f);
        System.out.println("Double="+h);
        System.out.print("String="+s);
        System.out.print("welcome to \"java\" class");
        System.out.print("Boolean="+bool);
        
	}

}*/

//PROGRAM FOR ARITHMETIC OPERATOR
/*public class First {

	public static void main(String[] args) {
		int a=111,b=50;
		System.out.println("Add="+(a+b));
		System.out.println("Sub="+(a-b));
		System.out.println("Mul="+(a*b));
		System.out.println("Div="+(a/b));
		System.out.println("Mod="+(a%b));
		System.out.println("a++="+(a++));
		System.out.println("a="+a);
		System.out.println("++a="+(++a));
		System.out.println("b--="+(b--));
		System.out.println("b="+b);
		System.out.println("--b="+(--b));

	}
	
}*/

//PROGRAM FOR RELATIONAL OPERATOR
/*public class First {

	public static void main(String[] args) {
		int a=20,b=90;
		System.out.println("A equal to B="+(a==b));
		System.out.println("A not equal to B="+(a!=b));
		System.out.println("A>B="+(a>b));
		System.out.println("A<B="+(a<b));
		System.out.println("A<=B="+(a<=b));
		System.out.println("A>=B="+(a>=b));
	}
}*/

//LOGICAL OPERATOR
/*public class First {

	public static void main(String[] args) {
		int a=20,b=10,c=5;  
		System.out.println("A is greater-"+((a>b)&&(a>c)));
		System.out.println("B is greater-"+((a<b)||(b>c)));
		System.out.println("A is greater than B-"+(!(a>b)));
		System.out.println("a="+(a+=8));
		System.out.println("b="+(b-=8));
		System.out.println("c="+(c*=8));
		System.out.println("a="+(a/=2));
		a=6;b=8;
		System.out.println("a>>1="+(a>>1));
		c=b<<2;
		System.out.println("b<<2="+c);
		System.out.println("b>>>2="+(b>>>2));
		System.out.println("a="+a);
		System.out.println("~a="+(~a));
	}
	
}*/

//CONTIONAL OPERATOR
/*public class First {

	public static void main(String[] args) {
      int a=100,b=99,c,d=98;
      c=((a<b)&&(a>d))?a:b;
      System.out.println("Greatest num="+c);
	}
}*/

//GREATEST OF 3 NUM
/*public class First {

	public static void main(String[] args) {
		int a=10,b=9,c=11;
		if(a>b && a>c)
			System.out.println("a is greater "+a);
		if(b>a && b>c)
			System.out.println("b is greater "+b);
		else
			System.out.println("c is greater "+c);
	}
}*/

//+VE OR -VE
/*public class First {

	public static void main(String[] args) {
		int a=0,b=3;
		if (a>0)
			System.out.println("A is positive="+a);
		else if (a==0)
			System.out.println("zero");
		else
			System.out.println("A is negative="+a);
	}
}*/

//ODD OR EVEN
/*public class First {

	public static void main(String[] args) {
		int a=101;
		if (a%2==0)
			System.out.println("a is even");
		else
			System.out.println("a is odd");
	}
	}*/

//WHILE DO WHILE FOR LOOP
public class First {

	public static void main(String[] args) {
		int a=15;
		do
		{
		System.out.println("a="+a);
		a+=3;
		}while(a<=11);
		System.out.println("For loop");
		for(int x=10;x<=15;x++)
		{
			System.out.println("x="+x);
		}
	}
}
	
	