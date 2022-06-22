import java.util.Scanner;

public class secondary_Diagonal_show {
	
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
		/*-------------------collom ------------*/
		
		int n;
		System.out.println("collom naa akta ");
		n=sc.nextInt();
		System.out.println(" dak");
		
		for(int i=0; i<row; i++)
		{
			for(int j=n-1; j<n; j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println("  ");
		}
		
		System.out.println("  ");
	

		
		/*---------------------primary diagonal--------------*/
		System.out.println(" prymary diagonal");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<collom; j++)
			{
				if(i==j) {
					System.out.print(matrix[i][j]+"\t");
				}
				else
					System.out.print("\t");
			}
			System.out.println();
		}	
	/* -------------secondary ----------*/
		
		int p=-1;
		int q=row;
		System.out.println("secindary ");
		for(int i=0; i<row; i++)
		{
		for(int j=0; j<row; j++)
		{
			if(i==p+1 && j==q-1)
			{
				p=i;
				q=j;
				System.out.print(matrix[i][j]+"\t");
			}
			else
				System.out.print("\t");
			
		}
		System.out.println();
		}	
			

}
}
