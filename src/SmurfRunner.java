
public class SmurfRunner {
public static void main(String[] args) {
	
	Smurf s1 = new Smurf("Handy");
	Smurf s2 = new Smurf("Papa");
	Smurf s3 = new Smurf("Smurfette");
	
	s1.eat();
	System.out.println(s1.getName());	
	

	System.out.println(s2.getName());
	System.out.println(s2.getHatColor());
	
	System.out.println(s2.isGirlOrBoy());	
	
	System.out.println(s3.getName());
	System.out.println(s3.getHatColor());
	System.out.println(s3.isGirlOrBoy());

	
	
	
}
}
