
public class NetflixRunner {
	public static void main(String[] args) {
	Movie m1 = new Movie("Black Panther",9);
	Movie m2 = new Movie("Spider-Man: Homecoming",8);
	Movie m3 = new Movie("Captain America: Civil War",8);
	Movie m4 = new Movie("Justice League",6);
	Movie m5 = new Movie("Wonder Woman",8);
	
	System.out.println(m1.getTicketPrice());
	
	NetflixQueue n1 = new NetflixQueue();
	n1.addMovie(m1);
	n1.addMovie(m2);
	n1.addMovie(m3);
	n1.addMovie(m4);
	n1.addMovie(m5);
	
	n1.printMovies();
	
	System.out.println("the best movie is" +m5);
	System.out.println("the worst movie is"+ m4);
	
	}
}
