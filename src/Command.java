import java.util.Random;
import java.util.Scanner;

public class Command {
	
	Random rand =new Random();
	Scanner sc =new Scanner(System.in);
	public int guest_;
	public static int commandCount;//static でメインから呼び出す
	
	 Dvd_BookShelf shelf ;//データをまとめる
	 Guest guest;
	 dvd_Products product;
	 Manager mana ;
	 Junken_Game  junken;
	
	Command(Dvd_BookShelf shelf,Guest guest,dvd_Products product,Manager mana,
			Junken_Game  junken){
		this.guest_=rand.nextInt(3)+1;
		this.shelf=shelf;
		this.guest=guest;
		this.product=product;
		this.mana=mana;
		this.junken=junken;
	}
	
	
	public  void print() {
		System.out.println("お客様が"+this.guest+"人きました");
		
		for(int i=0;i<guest_;i++) {
		System.out.println((i+1)+"人目");
		
		String textBlock ="""
				選びたい番号を入力してください
				1:\sDVDレンタル
				2:\s返却
				3:\s延滞
				4:\sじゃんけんゲーム
				""";
		System.out.println(textBlock);
	
		int n =sc.nextInt();
		commandCount=n;
		
		if(commandCount==1) {
			guest.print(product);
		}else if(commandCount==2) {
			
		}else if(commandCount==3) {
			
		}else if(commandCount==4) {
			junken.print();
		}
		
		}
	}
	
}
