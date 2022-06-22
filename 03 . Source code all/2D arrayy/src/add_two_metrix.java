import java.util.Scanner;

public class add_two_metrix {


 	public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		
 		int row[][]=new int[3][3];
 		int collom[][]=new int[3][3];
 		int sum[][]=new int[3][3];
 		int avarage;
 		Scanner sc=new Scanner(System.in);
 		/*-------------first intput----------------------------*/
 		System.out.println("enter first matrix inout no" );
 		for(int i = 0; i<3; i++)
 		{
 			for(int j=0; j<3; j++)
 			{
 				row[i][j]=sc.nextInt();
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
 		
 		/*-------------second input ------------------------------*/
 		System.out.println("enter second matrix input no" );
 		for(int i = 0; i<3; i++)
 		{
 			for(int j=0; j<3; j++)
 			{
 				collom[i][j]=sc.nextInt();
 			}
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
/*---------------addition input-----------------*/
 	System.out.println("  sum : " );
for(int i=0; i<3; i++)
{
for(int j=0; j<3; j++)
{
	sum[i][j]=row[i][j]+collom[i][j];
}
}
/*-----------addition output------------------*/
for(int i=0; i<3; i++)
{
for(int j=0; j<3; j++)
{
	System.out.print(sum[i][j]+"  ");
}
System.out.println(" ");
}
 	}
}
