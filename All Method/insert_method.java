package method;

public class insert_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer S1,S2;
		S1= new StringBuffer("I object oriented programming");
		System.out.println(S1);
		
		// after insert
		S2=new StringBuffer(" love ");
		S1=S1.insert(2,S2);
		System.out.println(S1);
	}

}
