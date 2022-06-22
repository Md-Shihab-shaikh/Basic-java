package stacks;

import java.util.LinkedList;
import java.util.Queue;

public class qq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue <Integer> q=new LinkedList<>();
			
		for(int i=0;i<7;i++)
			q.add(i);
		{
			System.out.println("uuuuuuuuuu"+q);
		
		
		//remove
		int removed=q.remove();
		System.out.println("ppppppp"+removed);
		System.out.println("ppppppp"+ q);
		
		}
		//head
		
		int head=q.peek();
		System.out.println("ppppppp"+ head);
		
		int t=q.size();
		System.out.println("oo"+t);
	}
}
