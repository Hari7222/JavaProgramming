  package stack;
import java.util.Stack;
public class StackPrg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.add(3, 56);//add(index,value)
        System.out.println("Stack elements: "+stack);
        int LastRemovedValue=stack.pop();
        System.out.println("Last removed value: "+LastRemovedValue);
        System.out.println("Updated:"+stack);
        System.out.println("Is stack empty: "+stack.isEmpty());//checks stack is empty or not
        System.out.println("Capacity: "+stack.capacity());
        System.out.println("Index of element 40: "+stack.indexOf(40));//gives index position
        System.out.println("Search 10: "+stack.search(56));//takes position value from last
        System.out.println("1st element: "+stack.firstElement());
        System.out.println("Last Index: "+stack.lastIndexOf(40));
        stack.addAll(stack);
       stack.clear();//Empty the stack
       System.out.println("Clear Stack: "+stack);
       
	}

}
