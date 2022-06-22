package genaral;



public class overwriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dog d1 = new Dog();
	      d1.displayInfo();
		
	}	
}
		
		class Animal {
			   public void displayInfo() {
			      System.out.println("I am a student .");
			   }
			}
		class Dog extends Animal {
			  
			   public void displayInfo() {
			      System.out.println(" Now I am a teacher.");
			   }
			}

	



