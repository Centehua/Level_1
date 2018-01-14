
public class Horse {
 
	String name;
	int HooveSize;
	
	public Horse(int HooveSize) {
		
		this.HooveSize= HooveSize;
		
	}
	

	public static void main(String[] args) {
		Horse h1 = new Horse(4);
		System.out.println(h1.HooveSize);
		
		
	}
}