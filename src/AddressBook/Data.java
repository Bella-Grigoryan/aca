package AddressBook;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Data implements Serializable{

	private static final long serialVersionUID = 1L;
	public boolean add(String fileName,  User user)
	  {
		  boolean b = false;
	      try
	      {
	    	 if (!(user.userName.equals("") || user.passWord.equals("")))
	    	 {
	    		 int id = get(fileName, user.userName, user.passWord);
	    		 if (id != 0)	 
	    			 System.out.println("The user is exist.");
	    		 else
	    		 {
	    			 FileOutputStream fileOut = new FileOutputStream(fileName);
	    			 ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         
	    			 out.writeObject(user);	         
	    			 out.flush();
	    			 fileOut.close();
	    			 b = true;
	    		 }
	    	 }
	    	 else
	    		 System.out.println("The username or password can't be null data.");
	    		 
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
          return b;
	  }
	
	  public void delete()
	  {}
	  public void edit()
	  {
		  
	  }
	  
	  public void addTelNumber(String fileName, String telNumber, int id)
	  {
		  try
	      {
	         FileInputStream fileIn = new FileInputStream(fileName);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         List<User> userList = new ArrayList<User>();
	         while (true)
	         {
	             try
	             {
	                 User user = (User) in.readObject();
	                 userList.add(user);
	             } catch (EOFException e)
	             {
	                 break;
	             }
	         }

	         in.close();
	         fileIn.close();
	         
	         for(int i = 0; i < userList.size(); i++)
	         {
	        	 if (userList.get(i).id == id)
	        		 userList.get(i).telNumbers.add(telNumber);
	         }
	         
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("User class not found");
	         c.printStackTrace();
	      }	  
	  }
	  
	  public void showTelNumbers(String fileName, int id)
	  {
		  try
	      {
	         FileInputStream fileIn = new FileInputStream(fileName);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         List<User> userList = new ArrayList<User>();
	         while (true)
	         {
	             try
	             {
	                 User user = (User) in.readObject();
	                 userList.add(user);
	             } catch (EOFException e)
	             {
	                 break;
	             }
	         }

	         in.close();
	         fileIn.close();
	         
	         for(int i = 0; i < userList.size(); i++)
	         {
	        	 if (userList.get(i).id == id)
	        	 {
	        		 for(int j = 0; j < userList.get(i).telNumbers.size(); j++)
	        		 
	        			 System.out.println(userList.get(i).telNumbers.get(j).toString());	        		    
	        	 }
	        		 
	         }
	         
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("User class not found");
	         c.printStackTrace();
	      }	  		  
	  }
	  
	  public int get(String fileName, String userName, String passWord)
	  {
	      int id = 0;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream(fileName);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         List<User> userList = new ArrayList<User>();
	         while (true)
	         {
	             try
	             {
	                 User user = (User) in.readObject();
	                 userList.add(user);
	             } catch (EOFException e)
	             {
	                 break;
	             }
	         }

	         in.close();
	         fileIn.close();
	         
	         for(int i = 0; i < userList.size(); i++)
	         {
	        	 if (userList.get(i).userName.equals(userName) && userList.get(i).passWord.equals(passWord))
	        		 id = userList.get(i).id;
	         }
	         
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("User class not found");
	         c.printStackTrace();
	      }
          return id;
	  }
}
