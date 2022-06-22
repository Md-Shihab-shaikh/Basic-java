package stacks;


	// Java orogram to demonstrate working of Queue 
	// interface in Java 
	import java.util.LinkedList; 
	import java.util.Queue; 

	public class QueueExample 
	{ 
	public static void main(String[] args) 
	{ 
	

		Queue <Integer>q1= new LinkedList<>(); 

		// Adds elements {0, 1, 2, 3, 4} to queue 
		for (int i=0; i<8; i++) 
		q1.add(i); 

		// Display contents of the queue. 
		System.out.println("Elements of queue-"+q1); 
		// To remove the head of queue. 
		int removedele = q1.remove(); 
		System.out.println("removed element-" + removedele); 

		System.out.println(q1); 

		// To view the head of queue 
		int head = q1.peek(); 
		System.out.println("head of queue-" +  head); 
 
		int size = q1.size(); 
		System.out.println("Size of queue-" + size); 
	
		
		
	} 
	} 

	
	


