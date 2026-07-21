import java.util.Random;
import java.util.Scanner;

public class Junken_Game {
	
	Scanner sc =new Scanner(System.in);
	Random rand =new Random();
	String [] A = {"グー","チョキ","パー"};

	
	public void print() {
		System.out.println("\nじゃんけんゲームを開始します");
		System.out.println("あなたが、賭けたいクレジットを入力してください");
		
		int credit =sc.nextInt();
		System.out.println("クレジットを表示します"+credit);
		
		print(credit);//オーバーロード
	}
	
	public void print(int credit) {
		System.out.println("CPUの強さを選んでください");
		
		String textBlock ="""
				選んでください
				1:弱い\sCpuの手が、あらかじめ表示されるが、勝っても0.01倍の金額しか帰ってきません
				2:ふつう
				3:最強\s\s勝てたら、2倍の賞金が得られます!!
				""";
		
		System.out.println(textBlock);
		
		int strength =sc.nextInt();
		
		if(strength==1) {
			System.out.println("選んでください");
			for(int i=0;i<A.length;i++) {
				System.out.println(i+":"+A[i]);
			}
			int cpuHand =rand.nextInt(3);
			System.out.println("\nCPUの手は"+A[cpuHand]+"です");
			
			int n =sc.nextInt();
			
			if(n==0&&cpuHand==2) {
				n=1;
			}else if(n==1&&cpuHand==0) {
				n=2;
			}else if(n==2&&cpuHand==1) {
				n=0;
			}else if(n==0&&cpuHand==0) {
				n=2;
			}else if(n==1&&cpuHand==1) {
				n=0;
			}else if(n==2&&cpuHand==2) {
				n=1;
			}
			System.out.println("あなたの手"+A[n]+"\nCPUの手"+A[cpuHand]+"\nあなたの勝ちです");
			
			int creditCount=(int)((double)credit*0.1);
			System.out.println("あなたのクレジットに対して0.1倍の賞金を獲得できました\s"+creditCount+"\\です");
			
			System.out.println("現在の所持金額は"+(credit+creditCount)+"円です");
			
		}
	}
}





