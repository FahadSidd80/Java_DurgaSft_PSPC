import java.util.*;

// Collection Concepts 

public class Collections {

	public static void main(String[] args) {
	
		
		
//		ArrayList l = new ArrayList();
//		l.add("A");
//		l.add(10);
//		l.add("A");
//		l.add(null);
//		
//		System.out.println(l);// [A, 10, A, null]
		
//		l.remove(2);
//		System.out.println(l);// [A, 10, null]
//		
//		l.add(2, "M");
//		System.out.println(l); // [A, 10, M, null]
//		l.add("N");
//		System.out.println(l);// [A, 10, M, null, N]
		
		
//		ArrayList<String> l = new ArrayList<String>();
//		l.add("A");
//		l.add("10");
//		l.add("A");
//		l.add(null);
//		
//		System.out.println(l);// [A, 10, A, null]
//		
//		l.remove(2);
//		System.out.println(l); // [A, 10, null]
//		
//		l.add(2, "M");
//		System.out.println(l);// [A, 10, M, null]
//		l.add("N");
//		System.out.println(l);// [A, 10, M, null, N]
		
		
//		LinkedList  l = new LinkedList();
//		l.add("durga");
//		l.add(30);
//		l.add(null);
//		l.add("Durga");
////		System.out.println(l);// [durga, 30, null, Durga]
//		l.set(0, "Software");
////		System.out.println(l);// [Software, 30, null, Durga]
//		l.add(0, "Vinky");
//		System.out.println(l);// [Vinky, Software, 30, null, Durga]
//		l.removeLast();
//		System.out.println(l);// [Vinky, Software, 30, null]
//		l.addFirst("CCC");
//		System.out.println(l);// [CCC, Vinky, Software, 30, null]
		
		
//		LinkedList<String>  l = new LinkedList<String>();
//		l.add("durga");
//		l.add(30);
//		l.add(null);
//		l.add("Durga");
//		System.out.println(l);// [durga, 30, null, Durga]
//		l.set(0, "Software");
//		System.out.println(l);// [Software, 30, null, Durga]
//		l.add(0, "Vinky");
//		System.out.println(l);// [Vinky, Software, null, Durga]
//		l.removeLast();
//		System.out.println(l);// [Vinky, Software, null]
//		l.addFirst("CCC");
//		System.out.println(l);// [CCC, Vinky, Software, null]
		
		
//		
//		Vector v = new Vector();
//		System.out.println(v.capacity());// 10
//		
//		for(int i=1; i<= 10; i++) {
//			v.addElement(i);
//		}
//		System.out.println(v.capacity());// 10
//		v.addElement("A");
//		System.out.println(v.capacity()); // 20
//		System.out.println(v);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
		
		
//		Vector v = new Vector(24);
//		System.out.println(v.capacity());// 24
//		
//		for(int i=1; i<= 10; i++) {
//			v.addElement(i);
//		}
//		System.out.println(v.capacity());// 24
//		v.addElement("A");
//		System.out.println(v.capacity()); // 24
//		System.out.println(v);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
//		
		
//		Vector v = new Vector(10,5);
//		System.out.println(v.capacity());// 10
//		
//		for(int i=1; i<= 10; i++) {
//			v.addElement(i);
//		}
//		System.out.println(v.capacity());// 10
//		v.addElement("A");
//		System.out.println(v.capacity()); // 15
//		System.out.println(v);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
		
//		Stack s = new Stack();
//		
//		s.push("A");
//		s.push("B");
//		s.push("C");
//		
//		System.out.println(s);// [A, B, C]
//		System.out.println(s.search("A"));// 3
//		System.out.println(s.search("Z"));// -1
		
		
//		Stack<String> s = new Stack<String>();
//		
//		s.push("A");
//		s.push("B");
//		s.push("C");
//		
//		System.out.println(s);// [A, B, C]
//		System.out.println(s.search("A"));// 3
//		System.out.println(s.search("Z"));// -1
		
//		
//		Stack<String> s = new Stack<String>();
//		
//		s.push("A");
//		s.push("B");
//		s.push("C");
//		
//		System.out.println("Print Complete stack "+s);// [A, B, C]
//		s.pop();// pop from top from index 3 or offset 1
//		System.out.println("After pop operation "+s); // [A,B]
//		s.peek();
//		System.out.println("After peek operation "+s);// After peek operation [A, B]
//		s.empty();
//		System.out.println("After empty operation " + s); // After empty operation [A, B]
//		s.search("X");
//		System.out.println("After search operation "+s);// After search operation [A, B]
//		System.out.println(s.search("A"));// 3
//		System.out.println(s.search("Z"));// -1
		
//		Stack<String> s = new Stack<String>();
//		System.out.println(s.capacity());// 10
		
		
//		Vector v = new Vector();
//		for(int i=0; i<=10;i++) {
//			v.addElement(i);
//		}
//		System.out.println(v);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//		
//		Enumeration  e = v.elements();
//		while(e.hasMoreElements()) {
//			Integer I = (Integer) e.nextElement();
//			if(I%2 ==0) {
//				System.out.println(I); // 0 2 4 6 8 10
//			}
//		}
//		System.out.println(v); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		
//		Vector<Integer> v = new Vector<Integer>();
//		for(int i=0; i<=10;i++) {
//			v.addElement(i);
//		}
//		System.out.println(v);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//		
//		Enumeration  e = v.elements();
//		while(e.hasMoreElements()) {
//			Integer I = (Integer) e.nextElement();
//			if(I%2 ==0) {
//				System.out.println(I); // 0 2 4 6 8 10
//			}
//		}
//		System.out.println(v); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		
//		Vector<Integer> v = new Vector<Integer>();
//		for(int i=0; i<=10;i++) {
//			v.addElement(i);
//		}
//		System.out.println(v);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//		
//		Enumeration<Integer>  e = v.elements();
//		while(e.hasMoreElements()) {
//			Integer I = (Integer) e.nextElement();
//			if(I%2 ==0) {
//				System.out.println(I); // 0 2 4 6 8 10
//			}
//		}
//		System.out.println(v); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		
//		System.out.println("Collection");
		
		
		
		
		
	}
	

}
