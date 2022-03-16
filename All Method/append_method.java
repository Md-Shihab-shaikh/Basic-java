package method;

public class append_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S;
		S = new String("Bangla");
		StringBuffer SB;
		SB= new StringBuffer("welcome to java ");
		S=SB.append(S).toString();
		System.out.println(S);
	}

}
