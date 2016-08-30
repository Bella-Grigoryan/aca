package AddressBook;

import java.util.List;
import java.util.Scanner;

import java.io.Serializable;

public class MainProg implements Serializable{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	 {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Please write down one of this commands 'Sign In' or 'Sign Up': ");
	  	 String command = in.nextLine();
	  	 
	  	 final String fileName = "data.txt";
	  	 Data data = new Data();
	  	 int id = 1;
	  	 MyException e = new MyException();
//	  	 Command commandLine;
	  	 
	 while (command != "Exit")
	 { 	 
		 switch(command) 
		 {
		 case "Sign Up":
		 { 
			 System.out.println("Please provide your username: ");
		  	 String userName = in.nextLine();
		  	 
			 System.out.println("Please provide your password: ");
		  	 String passWord = in.nextLine();
		  	 User user = new User(id, userName, passWord);
		  	  		 
		  	 if (data.add(fileName, user))
		  	 {
		  		 System.out.println("You have successfully created user.");		  		  
		  		 id++;
		  	 }	 
		  	 System.out.println("Please write down one of this commands 'Sign In' or 'Sign Up': ");
		  	 command = in.nextLine();
		  	 break;
		 }
		 case "Sign In":
		 {
		 	 System.out.println("Please provide your username: ");
		  	 String userName = in.nextLine();
		  	 
			 System.out.println("Please provide your password: ");
		  	 String passWord = in.nextLine();
		  	 int idLocal = data.get(fileName, userName, passWord);
			 if (idLocal != 0)
			 {	 
				 System.out.println("You are successfully logged in.");
				 System.out.println("Now you can write down one of this commands: ");
				 System.out.println("'Add Tel. Numb' or 'Show Tel. Numbers': ");
				 command = in.nextLine();
				 switch(command){
				 case "Add Tel. Numb":
				 {
					 System.out.println("Please provide your telephone number: ");
					 command = in.nextLine();
					 
					 data.addTelNumber(fileName, command, idLocal);
					 
					 System.out.println("You have successfully added your telephone number.");
					 System.out.println("If you want to add one more please write 'Add Tel. Numb'.");
					 System.out.println("If you want to see your numbers list please write 'Show Tel. Numbers'.");
					 command = in.nextLine();
					 break;
				 }
				 case "Show Tel. Numbers":
				 {
					 data.showTelNumbers(fileName, idLocal);
					 
					 System.out.println("Please write down one of this commands 'Sign In' or 'Sign Up': ");
				  	 command = in.nextLine();
					 break;
				 }
				 default:
				 {
					 System.out.println("Please write down one of this commands: 'Add Tel. Numb' or 'Show Tel. Numbers': ");
					 command = in.nextLine();
					 break;
				 }
  
				 }
			 }	 
		  	 System.out.println("Please write down one of this commands 'Sign In' or 'Sign Up': ");
		  	 command = in.nextLine();
		  	 break;
		 }
		 case "Help":
		 {
			 System.out.println("Please write down one of this commands: ");
			 System.out.println("Sign In");
			 System.out.println("Sign Up");
			 System.out.println("Add Tel.Numb");
			 System.out.println("Show Tel.Numbers");
			 System.out.println("Add Friend");
			 System.out.println("Help");
			 command = in.nextLine();
			 break;
		 }
		 default:
		 {
			 System.out.println("Invalid command. Please write 'Help' command for see command list: ");
		  	 command = in.nextLine();
			 break;
		 }
		 } 
	 }
	 }

}
