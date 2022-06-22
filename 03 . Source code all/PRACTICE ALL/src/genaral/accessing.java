package genaral;

class m {
	int Roll;
	String Name;
	float Mark;
	
	void Data()
	{
		Roll=555;
		Name = "kkkk";
		Mark = 80;

	}
	
	void Desplay()
	{
		System.out.println("Roll is : "+Roll);
		System.out.println("Name is : "+Name);
		System.out.println("Mark is : "+Mark);
	}
	
	
	
}

public class accessing {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m s = new m();
		s.Data();
		//s.Roll = 200;
		s.Desplay();
		

}
}
