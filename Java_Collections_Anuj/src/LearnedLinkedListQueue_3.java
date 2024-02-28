import java.util.Queue;
import java.util.LinkedList;

public class LearnedLinkedListQueue_3 {

	public static void main(String[] args) {
	
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		
		System.out.println(queue);// [12, 24, 36]
		
		System.out.println(queue.poll());// 12 - deleted
		System.out.println(queue);//[24, 36]
		
		System.out.println(queue.peek());// 24
		
		System.out.println(queue.poll());
		System.out.println(queue);

	}

}
