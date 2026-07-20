import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Dvd_BookShelf shelf =new Dvd_BookShelf();
		Guest guest =new Guest(shelf);
		dvd_Products product =new dvd_Products();
		guest.print(product);//nは新規か古参の照明
		
		

	  
	}

}
