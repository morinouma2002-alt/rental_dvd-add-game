import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dvd_BookShelf {
	
	Random rand =new Random();
	public static String [][] shelf =new String [5][4];
	public static List<String> shelfList =new ArrayList<>();
	
	String[] titles = {
			"アナと雪の女王",
		    "トイ・ストーリー",
		    "千と千尋の神隠し",
		    "君の名は。",
		    "ハリー・ポッターと賢者の石",
		    "ロード・オブ・ザ・リング 王の帰還",
		    "アバター",
		    "タイタニック",
		    "ジュラシック・パーク",
		    "スター・ウォーズ エピソード4",
		    "スパイダーマン",
		    "ダークナイト",
		    "ミッション：インポッシブル",
		    "パイレーツ・オブ・カリビアン ",
	};
	
	Dvd_BookShelf(){
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				shelf[i][j]=titles[rand.nextInt(titles.length)];
		        
				shelfList.add(shelf[i][j]);
				
			}
		}
	}
	
	public void print(){
		System.out.println("\n棚を表示します");
		
		for(int i=0;i<shelfList.size();i++) {
			System.out.print(shelfList.get(i)+"\s");
			
			if((i+1)%4==0) {
				System.out.println();
			}
		}
	
	}
}
