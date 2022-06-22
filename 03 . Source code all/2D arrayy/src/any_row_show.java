import java.util.Scanner;

public class any_row_show {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row;
		int collom;
		int sum = 0;
		int avarej;
		Scanner sc=new Scanner(System .in);
		System.out.println("row");
		row=sc.nextInt();
		System.out.println("collom");
		collom=sc.nextInt();
		int [][]matrix=new int[row][collom];
		
		
		
		/*---------matrix -----------*/
		System.out.println(" matrix input ");
		System.out.println("   ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<collom; j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("martix is ");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<collom; j++)
			{
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println(" ");
		}
		
		System.out.println("  ");
	/*------------row------------*/	
		int m;
		System.out.println("row naa akta ");
		m=sc.nextInt();
		System.out.println(" dak");
		
		for(int i=m-1; i<m; i++)
		{
			for(int j=0; j<collom; j++)
			{
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println("  ");
		}
}
}