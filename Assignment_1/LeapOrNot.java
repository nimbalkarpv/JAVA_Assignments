import java.util.Scanner;

class LeapOrNot{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		
		if (year % 4 == 0)
		{	
			if (year % 100 != 0)
			{
				if (year % 400 == 0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Not Leap Year");
				}
			}
			else
			{
				System.out.println("Not Leap Year");
			}
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
}