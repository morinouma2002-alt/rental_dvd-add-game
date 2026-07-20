import java.util.Random;
import java.util.Scanner;

public class Guest {
	
	Scanner sc =new Scanner(System.in);
	Random rand =new Random();
	Dvd_BookShelf shelf ;
	public int guest;
	public int oldGuest;
	
	
	Guest(Dvd_BookShelf shelf ){
		this.guest=rand.nextInt(3)+1;
		this.shelf=shelf;
	}
	
	public  void print(dvd_Products product) {
		System.out.println("お客様が"+this.guest+"人きました");
		
		for(int i=0;i<guest;i++) {
			System.out.println("\nあなたは、会員登録者ですか？");
			System.out.println("そうなら 0 違うなら 1を入力してください");
			
			while(!sc.hasNext()) {
				System.out.println("違います、0か1を入力してください");
				sc.next();
			}
			int n =sc.nextInt();
			
			if(n==0) {
				System.out.println("会員登録者:今なら、旧作のみ20%OFFのクーポンが適用されます");
				this.oldGuest=20;
				product.print(oldGuest,shelf,n);//別クラスの呼びだし
				
				
			}
			
		}
		
		
	}

}
