public class SnakeAndLadder
{


	public static void main(String[] args)
	{

		int start = 0;
		int won = 0;
		int player1 = start;
		int Noplay = 0;
		int Ladder = 1;
		int Snake = 2;
		int DieCount=0;

		while( won < 100 )
		{

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
				System.out.println("Player Got Ladder");
				player1 = player1 + DieNo ;
			}
			else
			{
				System.out.println("Player Got Snake");
				player1 = player1 - DieNo ;
			}


			if(player1 > 100)
				player1=won;

			won = player1;
			DieCount = DieCount+1;


			System.out.println("Won: " +won);
			System.out.println("Player1 position is " +player1);
			System.out.println("\n");
		}

		System.out.println("Dies count: " +DieCount);
		System.out.println("Player1 Won the game");
	}
}
