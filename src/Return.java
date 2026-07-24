
public class Return {

	
	private String[] title =new String[100];
	private int [] number =new int[100];;
	private int size=0;
	
	public void print(int number,String title) {
		this.title[size]=title;
		this.number[size]=number;
		size++;
	}
}
