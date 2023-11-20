public class Methods_Int_numbers {
	public static void main(String[] args) {
		Integer x=10;
		Float f=x.floatValue();
		System.out.println("Int x="+x);
		System.out.println("Float value f= "+f);
		String str="10";
		Integer y=Integer.parseInt(str);
		Double d=y.doubleValue();
		System.out.println("y="+y);
		System.out.println("d="+d);
		System.out.println(d.toString());
		System.out.println(String.valueOf(y));
		System.out.println(Math.abs(10-30));//difference without sign(+/-)
		System.out.println(Math.ceil(12.34));//higher value
		System.out.println(Math.floor(12.65));//lowest value
		System.out.println(Math.round(12.65));//>0.5 add 1 ie:13,<0.5 same number ie:12
		System.out.println(Math.pow(9,3));//1st num to the pow of 2nd num
		Integer a=10,b=10;
		System.out.println(a.compareTo(b));//Number value 
		System.out.println(a.equals(b));//boolean value
		String a1="hello",b1="hello";
		if(a1.equals(b1))
			System.out.println("Both strings r equal");
		if(a1.compareTo(b1)==0)
			System.out.println("both strings are equal");
		System.out.println(Math.min(90,32));//Minimum value
		System.out.println(Math.max(65, 62));//Maximum value
		//Convertoing int to string
		Integer z=20;
		System.out.println(String.valueOf(z));
		System.out.println(z.floatValue());
		System.out.println(z.doubleValue());
	}
}
