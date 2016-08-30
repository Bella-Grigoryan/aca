package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String userName;
	String passWord;
	List<String> telNumbers = new ArrayList<String>();
	
	public User()
	{}
	public User(int id, String name, String password)
	{
		this.id = id;
		this.userName = name;
		this.passWord = password;
	}

	int getId()
	{
		return this.id;
	}
	void setId(int id)
	{
		this.id = id;
	}
	String getUserName()
	{
		return this.userName;
	}
	void setUserName(String userName)
	{
		this.userName = userName;
	}
	String getPassWord()
	{
		return this.passWord;
	}
	void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}
	public int hashCode()
	{
		final int coeff = 31;
		int result = 1;
		result = coeff * result + this.userName.hashCode();
		result = coeff * result + this.passWord.hashCode();
		result = coeff * result + this.id;
		return result;
	}
	
	public boolean equals(Object obj) 
	{
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		User user = (User) obj;
		
		boolean b = false;
		
		if( (this.userName == user.userName || this.userName.equals(user.userName)) && 
			(this.passWord == user.passWord || this.passWord.equals(user.passWord)))
				b = true;
		
		return b;
	}
	
	public String toString()
	{         
		return this.userName + " " + this.passWord;

	}
}
