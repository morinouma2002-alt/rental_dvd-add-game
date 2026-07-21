import java.util.Scanner;

public class Main {
	
	static Dvd_BookShelf shelf =new Dvd_BookShelf();
	static Guest guest =new Guest(shelf);
	static dvd_Products product =new dvd_Products();
	static Manager mana =new Manager();
	static Junken_Game  junken=new Junken_Game();

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Command com =new Command(shelf,guest,product,mana,junken);
		com.print();
		
	}

}
