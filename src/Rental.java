import java.util.List;
import java.util.Scanner;

public class Rental {

	Dvd_BookShelf shelf;
	int n;
	List<Return> returns ;
	
	private Calculation cal =new Calculation();

	public void print(Dvd_BookShelf shelf, int n, List<Return> returns) {
		
		Scanner sc =new Scanner(System.in);
		this.shelf=shelf;
		this.n=n;
		this.returns=returns;
		
		shelf.print();//DVD棚を表示するメソッド
		
		returns.add(new Return());//客、一人に対してのオブジェクト（返却データ）を生成する
		Return r =returns.get(returns.size()-1);//参照を持ってくる
		/*客ごとの返却データをここに持たせたい:*/
		
		if(n==0) {
			System.out.println("\n会員登録者なので、旧作に対して20%offが適用されます");
			System.out.println("何枚レンタルしたいですか");
			
			while(!sc.hasNext()) {
				System.out.println("数値を入力してください");
				sc.next();
			}
			int want=sc.nextInt();
			System.out.println("何を借りたいか、入力してください");
			
			for(int i=0; i<want; i++) {
			System.out.println("借りたい番号を入力してください");
			int select =sc.nextInt()-1;
			String ans =Dvd_BookShelf.shelfList.get(select);
			
			r.print(select,ans);//returnsに追加していく 客一人一人の返却をためていく
	
			/*for(int i=0;i<Dvd_BookShelf .shelfList.size();i++) {
				System.out.print(Dvd_BookShelf .shelfList.get(i)+"\s");
				
				if((i+1)%4==0) {
					System.out.println();
				}
			}*/
			Dvd_BookShelf.shelfList.set(select,"貸出中");
			System.out.println("借りました");
			}
		}
			System.out.println("棚を再表示します");
			for(int i=0;i<Dvd_BookShelf.shelfList.size();i++) {
			System.out.print(Dvd_BookShelf .shelfList.get(i)+"\s");
		
			if((i+1)%4==0) {
			System.out.println();
		}
	}
			cal.print(n,returns);//Calculationをちゃんと　インスタンして、呼び出せるようにする
								//static に頼りすぎない
	}
}
