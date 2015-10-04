
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList; 

public class properMerging {

	public static void main(String[] args) {
		
		
		int [] p1 = {0, 5, 2, 3, 1, 4, 6};
		int [] q1 = {0, 3, 2, 1, 6, 5, 4};
		printInteger(p1, q1); 
		System.out.println(properMerging(p1, q1));
		
		int [] p2 = {0, 1, 2, 3, 4}; 
		int [] q2 = {0, 4, 2, 3, 1}; 
		printInteger(p2, q2);
		System.out.println(properMerging(p2, q2));
		
		int [] p3 = {0, 1, 4, 2, 3}; 
		int [] q3 = {0, 2, 3, 1, 4}; 
		printInteger(p3, q3); 
		System.out.println(properMerging(p3, q3));
		
		int [] p4 = {0, 5, 3, 4, 2, 1}; 
		int [] q4 = {0, 3, 5, 2, 4, 1}; 
		printInteger(p4, q4); 
		System.out.println(properMerging(p4, q4));
		
		int [] p5 = {0, 3, 2, 6, 4, 5, 1, 7}; 
		int [] q5 = {0, 2, 4, 1, 5, 7, 3, 6}; 
		printInteger(p5, q5); 
		System.out.println(properMerging(p5, q5));
	}
		
	public static Queue properMerging (int[] p, int q[]){
		
		
		int [] pHelper = new int[p.length]; 
		int [] qHelper = new int[q.length]; 
		
		Queue<Integer> pQueue = new LinkedList<Integer>(); 
		Queue<Integer> qQueue = new LinkedList<Integer>(); 
		
		Queue<String> result = new LinkedList<String>(); 
		
		int i = 1; 
		
		for (i = 1; i < q.length; i++) {
			pHelper[p[i]] = i; 
			qHelper[q[i]] = i; 
			pQueue.add(p[i]); 
			qQueue.add(q[i]); 
		}
		
		while (!(pQueue.isEmpty() && qQueue.isEmpty())){
		  try {
			if (pHelper[(int)pQueue.peek()] != 0) {
				for (i = pHelper[(int)pQueue.peek()]; i <= pHelper[(int)qQueue.peek()]; i++) {
					int pPopOut = (int) pQueue.poll(); 
					
					result.add(String.valueOf(pPopOut)); 
					pHelper[pPopOut] = 0; 
					
					int qPopOut = qQueue.peek(); 
					if (qQueue.peek() == pPopOut) {
						result.add(String.valueOf(qQueue.poll()) + "' "); 
						qHelper[qPopOut] = 0; 
					}
					
				}
				 
			} 
			if (qHelper[qQueue.peek()] != 0)
				result.add((String)(String.valueOf(qQueue.poll())+ "' ")); 
			
		  }
		  catch (NullPointerException e) {
			  while (!qQueue.isEmpty()){
				  result.add((String)(String.valueOf(qQueue.poll()) +  "' ")); 
			  }
		  }
		}
	
		return result; 
			
	}

	
	public static void printInteger(int[] pArray, int [] qArray){
		System.out.print(" p: "); 
		for (int i: pArray){
			if (i != 0)
			System.out.print(i +  ", "); 
		}
		System.out.print(" q: "); 
		for (int i: qArray){
			if (i != 0)
			System.out.print(i + ", "); 
		}
		System.out.print(" result: "); 
	}
}
