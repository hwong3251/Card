
public class DeckTester {

	public DeckTester() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[]args)
	{
		String[]ranks = new String[]{"A","B","C"};
		String[]suits = new String[]{"D","E","F"};;
		int[]values = new int[]{1,2,3};
		
		Deck test1 = new Deck(ranks,suits,values);
		for(int i = 0; i < test1.unDealt.size(); i ++)
		{
			System.out.println(test1.unDealt.get(i));
		}
		test1.shuffle();
		
		System.out.println("Shuffled");
		for(int i = 0; i < test1.unDealt.size(); i ++)
		{
			System.out.println(test1.unDealt.get(i));
		}
		
	}
}
