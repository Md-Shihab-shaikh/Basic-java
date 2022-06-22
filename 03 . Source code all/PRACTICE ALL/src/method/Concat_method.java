package method;

public class Concat_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1,S2;
		S1=new String("object oriented");
		S2=new String("programming");
		System.out.println(S1);
		System.out.println(S2);
		S1=S1.concat("  ");
		S1=S1.concat(S2);
		System.out.println(S1);
		System.out.println(S2);
	}

}
