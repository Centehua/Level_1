
public class SeaCreatureRunner {
 
 public static void main(String[] args) {
	SeaCreature SC1 = new SeaCreature("Spongebob"); 
	SeaCreature SC2 = new SeaCreature("Patrick"); 
	SeaCreature SC3 = new SeaCreature("Squidward"); 
	
	SC1.eat();
	SC1.laugh();
	
	
	System.out.println();
	SC2.eat();
	SC2.laugh();
	
	
	System.out.println();
	SC3.eat();
	SC3.laugh();
}

 
}
