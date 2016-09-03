package SchemaAddressBook;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Data implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public boolean add(String fileName,  User user)
	{
		boolean b = false;
	    //TODO
		return b;
	}
	public int get(String fileName, String userName)
	{
	    int id = 0;
        //TODO
	    return id;
	}	
	public void delete(String fileName, int id)
	{
		//TODO
	}
	public void edit(String fileName, int id)
	{
		//TODO
	}

	public void addFriend(String fileName, int userId, int friendId)
	{
		//TODO
	}
	public boolean deleteFriend(String fileName, int userId, int friendId)
	{
		boolean b = false;
		//TODO
		return b;
	} 
	public List<String> showFriendsList(String fileName, int id)
	{
		//TODO
	}  
	
	public void addPhone(String fileName, Phone phoneType, int id, String phone)
	{
        //TODO
	}
	public List<String> showPhoneNumbers(String fileName, int id)
	{
		//TODO
	}  
}
