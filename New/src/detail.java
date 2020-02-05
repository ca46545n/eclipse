import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class detail {


	public static void main(String[] args) {
	   
  
		List<String> Nem = new ArrayList<>();
		List<String> Npw = new ArrayList<>();
		
	
		while(true) {	
			
			
		
			//put possible for loop here do research 
			
	    Scanner lol = new Scanner(System.in);
		System.out.print(" \n Welcome ! Do you happen to have an account : \n");
		
		String answer = lol.nextLine();
		System.out.print("\n Your Answer is : " + answer );

		
		if (answer.equalsIgnoreCase("yes")) {	
		System.out.println(" \n Great lets get started! ");
	
		
		
		Scanner em = new Scanner(System.in);
		System.out.print(" \n What is your email : \n");
		
	
		

	 
		String name = em.nextLine();
		System.out.print(" your Email is : " + name);
		
		
		if (name.equals(Nem));
		
		System.out.print("Great now lets proceed to password....");
		
		
		Scanner pw = new Scanner(System.in);
		System.out.print(" \n What is your password : \n");
		
		

		String name2 = pw.nextLine();
		System.out.print(" your password  is : " + name2);
		
		
		if(name2.equals(Npw));
		
		
		if(name.equals(Nem) && (name2.equals(Npw))) {
		//figure out how to do a for loop which allowes access if info right maybe just need another for loop!
			
			// Adding to mysql figuring out how to use properly !!!!!***
		  // figure out how to save the inputs into the  list !!!*********
			
			
		System.out.print("Welcome back What are you hungry for....");
		
		}else {
			System.out.print("Sorry your input information is wrong");
		}

		
		
		break;
		// in list making remember .add and append 
		
		// enter into the "site"
		
		}else if (answer.equalsIgnoreCase("no")) {
			System.out.println(" \n You need to create an account before you can proceed.....");
			
			Scanner emailName = new Scanner(System.in);
			System.out.print(" \n What is your current email : \n");
			
			
			String em = emailName.nextLine();
			System.out.print(" The email you have entered in   :  " + em);
			
			
			Nem.add(em);
			System.out.println(Nem);
			
			
			Scanner passWord = new Scanner(System.in);
			System.out.print(" \n What password would you like to create  : \n");
			
			
			String pw = passWord.nextLine();
			System.out.print(" The Password you have entered in   : " + pw);
			Npw.add(pw);
			System.out.println(Npw);
			
			System.out.print("Great! you have successfully created an account. You should be getting a confirmation email soon. \n ");
			System.out.print(" You should be able to login now. ");
			
			
			// Figure out how to get back to the top!
		
			
			
			
			// create an account 	
		
			
			
		}else {
			System.out.print("  \n What the heck was that response.......Let's try again. ");
			
			// ask again if they have an account
			
			
			
		}
		 
	
		
	}
		 
		
	}
	
	
}



	


