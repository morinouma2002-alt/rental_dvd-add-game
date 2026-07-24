import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RegiMainMenue {//色々なクラスを、呼び出したい
	
	Random rand =new Random();
	Scanner sc =new Scanner(System.in);
	public int guestNum;
	public  int commandCount;
	
	 Dvd_BookShelf shelf ;//データをまとめ
	 Rental rental;
	 Manager mana ;
	 Junken_Game  junken;
	 
	 List <Return> returns;
	
	RegiMainMenue(List <Return> returns){
//		this.shelf=shelf;     処理を増やさない    
		
		this.guestNum=rand.nextInt(3)+1; 
		this.shelf = new Dvd_BookShelf();
		this.rental=new Rental();
		this.mana=new Manager();
		this.junken=new Junken_Game();
		
		this.returns=returns;
	}
	
	
	public  void print() {
		System.out.println("お客様が"+this.guestNum+"人きました");
		
		for(int i=0;i<guestNum;i++) {
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
			rentalPrint();
		}else if(commandCount==2) {
			
		}else if(commandCount==3) {
			
		}else if(commandCount==4) {
			junken.print();
		}
		
		}
	}
	
	public void rentalPrint() {
		
		System.out.println("\nあなたは、会員登録者ですか？");
		System.out.println("そうなら 0 違うなら 1を入力してください");
		
		while(!sc.hasNext()) {
			System.out.println("違います、0か1を入力してください");
			sc.next();
		}
		int n =sc.nextInt();
		
		if(n==0) {
			System.out.println("会員登録者:今なら、旧作のみ20%OFFのクーポンが適用されます");
			rental.print(shelf,n,returns);//別クラスの呼びだし
			
			
		}
		
	}
	
}
	
