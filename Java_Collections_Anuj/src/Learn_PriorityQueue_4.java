import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Learn_PriorityQueue_4 {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		Queue<Integer> pq = new PriorityQueue<>();
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// coverted to max heap
		
		pq.offer(48);
		pq.offer(12);
		pq.offer(36);
		pq.offer(24);
		pq.offer(10);
		
//		System.out.println(pq);// [10, 12, 36, 48, 24] -- used min heap internally -- sabse chote element among all sabse top pe hoga... and rest will go as it is.
//		
////		pq.poll();
//		System.out.println(pq.poll());// 10
//		System.out.println(pq);// [12, 24, 36, 48]
//		
//		System.out.println(pq.peek());// 12
//		System.out.println(pq);// [12, 24, 36, 48]
		
		
		System.out.println(pq);// 	[48, 24, 36, 12, 10].
		
//		pq.poll();
		System.out.println(pq.poll());// 48
		System.out.println(pq);//[36, 24, 10, 12]
		
		System.out.println(pq.peek());// 36
		System.out.println(pq);//[36, 24, 10, 12]
		
	
				
		
		
		
		
		

	}

}
