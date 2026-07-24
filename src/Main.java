import java.util.ArrayList;
import java.util.List;

public class Main {
	
//	static Dvd_BookShelf shelf =new Dvd_BookShelf();
//	static Guest guest =new Guest(shelf);
	
	public static void main(String[] args) {
		List <Return> returns =new ArrayList<>();
		
		RegiMainMenue com =new RegiMainMenue(returns);
		
		com.print();
		
	}

}
