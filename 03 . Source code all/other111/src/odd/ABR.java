package odd;

import java.lang.reflect.Array;
public class ABR {	
 int max(int a[])
{
		int max=a[0];

		for(int i=0; i<a.length; i++)
		{
			if(a[i]<max)
                 {
	              max=a[i];  
                 }
		}
		return max;
	}
	public static void main(String[] args) { 

		int b[]= {15,20,50,4,26,8,9,7,90,15};
		ABR m = new ABR();
		System.out.println("max   "+m.max(b));
}}