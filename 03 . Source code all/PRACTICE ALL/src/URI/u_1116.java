package URI;

import java.util.Scanner;

public class u_1116 {	
	/**
	3
	3 -2			-1.5
	-8 0			divisao impossivel
	0 8				0.0					
*/

public static void main(String[] args) {
int N;
int X, Y;
float result;
Scanner input =new Scanner(System.in);
N = input.nextInt();
for (int i = 1; i <= N; i++) {
X = input.nextInt();
Y = input.nextInt();
if (Y == 0) {
System.out.print("divisao impossivel\n");
}else {
result =(float) X / Y;
System.out.printf("%.1f\n",result);
}

}
}


}
