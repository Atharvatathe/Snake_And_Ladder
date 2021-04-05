public class SnakeAndLadder
{


	public static int start = 0;
	public static int Is_player1_won = 0;
	public static int Is_player2_won = 0;
	public static int player1 = start;
	public static int player2 = start;
	public static int DieCount=0;
	
	public static void player1()
	{
	    int Noplay = 0;
		int Ladder = 1;
		int Snake = 2;
		
		int DieNo = (int) Math.floor(Math.random() *6+1 );
		int option = (int) Math.floor(Math.random() * 10) % 3 ;
		
		System.out.println("Die number : " +DieNo);
		System.out.println("option : " +option);
		
		if(player1 < 0 )
			player1 = 0;
			
			if(option == Noplay)
			{
				System.out.println("Player1 is not played");
			}
			else if(option == Ladder)
			{
				System.out.println("Player1 Got Ladder");
				player1 = player1 + DieNo ;
				player1();
			}
			else
			{
				System.out.println("Player1 Got Snake");
				player1 = player1 - DieNo ;
			}
			
			if(player1 < 0)
				player1 = 0;

			if(player1 > 100)
				player1=Is_player1_won;

			Is_player1_won = player1;
			
			DieCount = DieCount+1;
			System.out.println("Is_player1_won: " +Is_player1_won);
			System.out.println("Player1 position is " +player1);
			System.out.println("\n");
	}
	
	public static void player2()
	{
		
		int Noplay = 0;
		int Ladder = 1;
		int Snake = 2;
		
		int DieNo = (int) Math.floor(Math.random() *6+1 );
		int option = (int) Math.floor(Math.random() * 10) % 3 ;
		
		System.out.println("Die number : " +DieNo);
		System.out.println("option : " +option);
		
		if(player2 < 0 )
			player2 = 0;

			
			if(option == Noplay)
			{
				System.out.println("Player2 is not played");
			}
			else if(option == Ladder)
			{
				System.out.println("Player2 Got Ladder");
				player2 = player2 + DieNo ;
				player2();
			}
			else
			{
				System.out.println("Player2 Got Snake");
				player2 = player2 - DieNo ;
			}

			if(player2 < 0)
				player2 = 0;
				
			if(player2 > 100)
				player2=Is_player2_won;

			Is_player2_won = player2;
			
			DieCount = DieCount+1;
			System.out.println("Is_player2_won: " +Is_player2_won);
			System.out.println("Player2 position is " +player2);
			System.out.println("\n");
	}
	public static void main(String[] args)
	{

	
		
	
		while( Is_player1_won < 100 && Is_player2_won < 100 )
		{

			SnakeAndLadderUC7.player1();
			SnakeAndLadderUC7.player2();
		}
			
		if(Is_player1_won == 100)
			System.out.println("Player1 Won the game");
		
		if(Is_player2_won == 100)
			System.out.println("Player2 Won the game");
		
		System.out.println("Dies count through out the game: " +DieCount);
	
	}
}
