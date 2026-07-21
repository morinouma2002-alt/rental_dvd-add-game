import java.util.List;
import java.util.Random;

public  class Calculation {
	
	 public static  String [] value ={"新作","普通","旧作"};
	 
	 static int [] price = {120,100,80};
	
	public static void print(int n,List<String> shelfList,String[] ans) {
		Random rand =new Random();
		int sum=0;
		
		System.out.println("\n料金計算に移ります");
		if(n==0) {//古参の区別
			System.out.println("あなたは、会員登録者なので旧作に対して20パーオフが適用されます");
			
			System.out.println("\n現在借りてるDVDを表示します");
			
			for(int i=0;i<ans.length;i++) {
				if(ans[i]==null){
						break;
			}
				int randomCount=rand.nextInt(3);
				System.out.println(ans[i]+" "+value[randomCount]+"作です");
				
				if(value[randomCount].equals("旧作")) {
			    int p =(int)((double)price[randomCount]*0.8);
			    sum+=p;
			    Manager.sales+=p;
			    
				}else {
				sum+=price[randomCount];
				Manager.sales+=price[randomCount];
				}
		}
	
	}
		
		System.out.println(sum+"\\です");
}
}
