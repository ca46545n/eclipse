import java.util.Scanner;

public class next {
	
	public static void main(String[] args) {
		System.out.print(" Please answer the following questions. \n");
	
		Scanner whereru = new Scanner(System.in);
		System.out.print("Where are you ? : ");
		
		String location = whereru.nextLine();
		System.out.print(" Your location is : " + location  );
		
		
		Scanner food = new Scanner(System.in);
		System.out.print(" \n What type of food  are you looking for ? ");
	
		
		String eats = food.nextLine( );
		System.out.print(" So your looking for  : " + eats );
		
	}

}
