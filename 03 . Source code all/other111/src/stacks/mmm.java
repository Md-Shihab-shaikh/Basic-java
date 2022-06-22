package stacks;

import java.io.*;
import java.util.Stack;
class mmm {

	private static Integer i;







	static void stack_push(Stack<Integer>stack)
	
	{
		for(int i=0;i<5;i++);
		{
			stack.push(i); 
		}
	}
	
	
	static void stack_pop(Stack<Integer>stack)
	{
		for(int i=0;i<5;i++);
		{
		Integer y =(Integer) stack.pop();
		System.out.println(y); 
		}
	}
	
	static void stack_peek(Stack<Integer>stack)
	{
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top : " + element); 
	}
	

	
	
	
	
	
	public static void main(String[] args, Stack<Integer> stack) {
		// TODO Auto-generated method stub
Stack<Integer>stavk=new Stack<Integer>();

stack_push(stack);

stack_pop(stack);
stack_push(stack);
stack_peek(stack);
		
		
	}

}
