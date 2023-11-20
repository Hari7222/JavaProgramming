package queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueuePrg {
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		queue.offer(60);
		System.out.println("Queue : "+queue);
		queue.poll();
		System.out.println(queue);
		System.out.println("Add 20 :"+queue.add(20) +" "+queue);
		System.out.println("Contains values?: "+queue.containsAll(queue));
		System.out.println("Contains 21? : "+queue.contains(21));
		System.out.println("size: "+queue.size());
		System.out.println(""+queue.);
	}

}
