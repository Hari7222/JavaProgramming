package funcAS;

public class funcMain {

	public static void main(String[] args) {
		funcClass<Integer> func=new funcClass<Integer>();
		System.out.println("Addition: "+func.add(10, 20));
		System.out.println("Subtraction: "+func.sub(30, 10));
		System.out.println("Multiplication: "+func.mul(10, 12));
		System.out.println("Division: "+func.div(120, 0));
	}

}
