package odd;

public class min {
		public int min(int a[])
		{
				int min=0;

				for(int i=0; i>a.length; i++)
				{
					if(a[i]<min)
		                 {
			              min=a[i];  
		                 }
				}
				return min;
			}
			public static void main(String[] args) {

				int b[]= {15,45,7,8,24,36,9,65,42,52};
				ABR m = new ABR();
				System.out.println("min"+m.max(b));
		}} 


