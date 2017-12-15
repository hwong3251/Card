
public class DeckTester {

	public DeckTester() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[]args)
	{
		String[]ranks = new String[]{"A","B","C","D"};
		String[]suits = new String[] {"Giraffes","Lions"};
		int[]values = new int[]{1,2,3,4};
		
		Deck test1 = new Deck(ranks,suits,values);
		for(int i = 0; i < test1.unDealt.size(); i ++)
		{
			System.out.println(test1.unDealt.get(i));
		}
		Card test2 = test1.deal();
		System.out.println("Dealt Card: " + test2);
		for(int i = 0; i < test1.Dealt.size(); i ++)
		{
			System.out.println(test1.Dealt.get(i));
		}
		for(int i = 0; i < test1.unDealt.size(); i ++)
		{
			System.out.println(test1.unDealt.get(i));
		}
	}
}
