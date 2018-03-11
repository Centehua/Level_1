
public class Animal {
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		boolean b1 =a1.catEat("icecream");
		
		
		if(b1==false) {
			System.out.println("Cats cannot eat");
		}else{
			System.out.println("Cats can eat" );
		} 
		
		
		
	}
	
boolean catEat(String food) {
	if(food.equals("bananas")) {
		
		return true;
		
	} else if (food.equals("cat food")) {
		return true;
	} else {
		return false; 
	} 
	
} 



}
