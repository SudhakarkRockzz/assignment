public class pattern8 {
		public static void main(String[]args) {
		for(int row=1; row<=9;row++)
		{
			for(int col=1; col<=9; col++)
				{
				if(col==1 || col==9 || (row==col) || (row+col==10) )
					{
					if(row<=5)
						System.out.print("* ");
					else
						System.out.print("  ");
					}
				else
					System.out.print("  ");
				}
			System.out.println();
		}
		
	}

}
