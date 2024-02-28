import java.util.ArrayDeque;

public class LearnArrayDequeue_5 {

	public static void main(String[] args) {
		 
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(23);
		adq.offerFirst(12);
		adq.offerLast(45);
		adq.offer(26);
//		
//		System.out.println(adq);//  by default implement min heap so 12 frist
//		
//		System.out.println(adq.peek());// 12 - first element niklega
//		System.out.println(adq.peekFirst());// 12
//		System.out.println(adq);
//		
//		System.out.println(adq.peekLast());
		
		System.out.println(adq);
		System.out.println(adq.poll()); // 12
		System.out.println("poll() " +adq); // poll() [23, 45, 26]
		
		System.out.println(adq.pollFirst()); // 23
		System.out.println("pollFirst() " +adq);
		
		System.out.println(adq.pollLast());
		System.out.println("pollLast() " +adq);


	}

}

//------------------------------------------------------------------------------------------------------

//ArrayDeque<Integer> adq = new ArrayDeque<>();
//
//
//adq.offer(23);
//adq.offerFirst(12);
//adq.offerLast(45);
//adq.offer(26);
//
//System.out.println(adq);
//
//System.out.println(adq.peek());
//System.out.println(adq.peekFirst());
//System.out.println(adq.peekLast());
//
//System.out.println(adq.poll());
//System.out.println("poll() " +adq);
//
//System.out.println(adq.pollFirst());
//System.out.println("pollFirst() " +adq);
//
//System.out.println(adq.pollLast());
//System.out.println("pollLast() " +adq);
