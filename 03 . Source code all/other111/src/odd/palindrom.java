package odd;

	import java.util.Scanner;

	public class palindrom {
		 private static Scanner input;

		public static void main(String[] args) 
		
		// MD SHIHAB SHAIKH 
		 
		 /* 171 =171,and 156=651 */
		 { 
			 input = new Scanner (System.in);
				System.out.print("how number");
				int n= input.nextInt();
							
		         int r,sum=0,temp;    
		         temp=n;    
		         while(n>0){    
		          r=n%10;   
		          sum=(sum*10)+r;    
		          n=n/10;    
		         }    
		         if(temp==sum)    
		          System.out.println("palindrome number ");    
		         else    
		          System.out.println("not palindrome");    
		       }  
		       }  
		




