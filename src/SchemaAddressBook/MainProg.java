package SchemaAddressBook;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
			  	 int idLocal = data.get(fileName, userName);
				 if (idLocal != 0)
				 {	 
					 System.out.println("You are successfully logged in.");
					 System.out.println("Now you can write down one of this commands: ");
					 System.out.println("'Add Tel. Numb' or 'Show Tel. Numbers': ");
					 command = in.nextLine();
					 switch(command){
					 case "Add Tel. Numb":
					 {
						 System.out.println("Please provide your phone number type (etc. MOBILE, HOME, FAX): ");
						 command = in.nextLine();
						 
						 Phone phone = Phone.valueOf(command);
						 					 
						 System.out.println("Please provide your telephone number: ");
						 command = in.nextLine();
						 data.addPhone(fileName, phone, idLocal, command);
						 
						 System.out.println("You have successfully added your telephone number.");
						 System.out.println("If you want to add one more please write 'Add Tel. Numb'.");
						 System.out.println("If you want to see your numbers list please write 'Show Tel. Numbers'.");
						 command = in.nextLine();
						 break;
					 }
					 case "Show Tel. Numbers":
					 {
						 List<String> phoneList = data.showPhoneNumbers(fileName, idLocal);
						 System.out.println(phoneList);
						 
						 System.out.println("Please write down one of this commands 'Sign In' or 'Sign Up': ");
					  	 command = in.nextLine();
						 break;
					 }
					 case "Add Friend":
					 {
						 System.out.println("Please provide your friend username: ");
						 command = in.nextLine();
						 
						 int idFriend = get(fileName, command);
						 if (addFriend(fileName, idLocal, idFriend))
 						     System.out.println("You have successfully added " + command + " to your friends list.");
						 else
						     System.out.println("The username " + command + " is in your friends list.");
						 
						 command = in.nextLine();
						 break;
					 }
					 case "Show Friends List":
					 {
						 List<String> friendList = showFriendsList(fileName, id);
						 System.out.println(friendList);
				
					  	 command = in.nextLine();
						 break;
					 }
					 case "Delete Friend":
					 {
						 System.out.println("Please provide your friend username: ");
						 command = in.nextLine();
						 
						 int idFriend = get(fileName, command);
						 if (deleteFriend(fileName, idLocal, idFriend))
							 System.out.println("Thank you. Now " + command + " and you are not friends.");
						 else
							 System.out.println("Sorry. You don't have friend with " + command + " username.");
							 
					  	 command = in.nextLine();
						 break;
					 }
					 default:
					 {
						 System.out.println("Please write down one of this commands: ");
						 System.out.println("'Add Tel. Numb', 'Show Tel. Numbers', 'Add Friend', 'Delete Friend' or 'Show Friends List': ");
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
				 System.out.println("Show Friends List");
				 System.out.println("Delete Friend");
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

