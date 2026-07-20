import java.util.Scanner;

public class dvd_Products {

	
	public void print(int oldGuestCupon,Dvd_BookShelf shelf,int n) {
		
		Scanner sc =new Scanner(System.in);
		
		shelf.print();//DVD棚を表示するメソッド
		
		if(n==0) {
			System.out.println("\n会員登録者なので、旧作に対して20%offが適用されます");
			System.out.println("何枚レンタルしたいですか");
			
			while(!sc.hasNext()) {
				System.out.println("数値を入力してください");
				sc.next();
			}
			int want=sc.nextInt();
			System.out.println("何を借りたいか、入力してください");
			
			for(int i=0;i<want;i++) {
			System.out.println("借りたい番号を入力してください");
			int select =sc.nextInt()-1;
			/*for(int i=0;i<Dvd_BookShelf .shelfList.size();i++) {
				System.out.print(Dvd_BookShelf .shelfList.get(i)+"\s");
				
				if((i+1)%4==0) {
					System.out.println();
				}
			}*/
			
			String ans =Dvd_BookShelf.shelfList.get(select);
			Dvd_BookShelf.shelfList.set(select,"貸出中");
			System.out.println("借りました");
			}
		}
		System.out.println("棚を再表示します");
		for(int i=0;i<Dvd_BookShelf .shelfList.size();i++) {
		System.out.print(Dvd_BookShelf .shelfList.get(i)+"\s");
		
		if((i+1)%4==0) {
			System.out.println();
		}
	}
	}
}
