import java.util.Scanner;

public class multiplication {


 	public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		
 		int row[][]=new int[3][3];
 		int collom[][]=new int[3][3];
 		int multi[][]=new int[3][3];

 		Scanner sc=new Scanner(System.in);
 		/*-------------first input----------------------------*/
 		System.out.println("enter first matrix inout no" );
 		for(int i = 0; i<3; i++)
 		{
 			for(int j=0; j<3; j++)
 			{
 				row[i][j]=sc.nextInt();
 			}
 		}
 		
 		/*-------------second input ------------------------------*/
 		System.out.println("enter second matrix input no" );
 		for(int i = 0; i<3; i++)
 		{
 			for(int j=0; j<3; j++)
 			{
 				collom[i][j]=sc.nextInt();
 			}
 		}
 		/*--------------first out put---------------------------*/
 		System.out.println("first matrix :" );
 		for(int i = 0; i<3; i++)
 		{
 			for(int j=0; j<3; j++)
 			{
 				System.out.print(row[i][j]+"  ");
 			}
 			System.out.println(" ");
 		}
 			
 		/*--------------- second output----------------------*/
 		System.out.println("second matrix" );
 		for(int i = 0; i<3; i++)
 		{
 			for(int j=0; j<3; j++)
 			{
 				System.out.print(collom[i][j]+"  ");
 			}
 			System.out.println(" ");
 		}
 		
 		
 	System.out.println(" ");	
 	
 	
/*---------------multi input-----------------*/
 	System.out.println("  multiplication : " );


 	
 	for (int i = 0;  i<collom.length; i++) 
 	       {
 		      for (int j = 0; j<row.length; j++) 
 		           {
 		               int temp =0;
 		
 		                for (int k = 0; k < row.length; k++) 
 		                {
 		                     temp = temp + row[i][k] * collom[k][j];
 		                }
 		               multi[i][j] = temp;
 		           }
 		  }
 	for (int i = 0; i < multi.length; i++) 
 	     {
 		     for (int j = 0; j < multi.length; j++) 
 		       {
 			      System.out.print("\t"+multi[i][j]);
 		       }
 		   System.out.println(" ");
 	     }



 	}
}
