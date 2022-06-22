package URI;

import java.util.Scanner;

public class u_1114 {
	
	
	/*              Input         Output
	 *              2200         Senha Invalida  
	 *              1020         Senha Invalida
	 *              2022         Senha Invalida
	 *              2002         Acesso Permitido             
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner Sc = new Scanner(System.in);
				
				

		for(int i=0; i<100; i++)
		{
			n=Sc.nextInt();
			if(n==2002){
				System.out.println("Acesso Permitido");
				break;
			}
			
			
			else
			{
				System.out.println("Senha Invalida");
			}
		}
		
				
	}

}
