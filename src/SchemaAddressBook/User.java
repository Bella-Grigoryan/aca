package SchemaAddressBook;

public class User {
 
	private final int id;
	String userName, passWord;
	UserMap userMap;
	UserPhone userPhone;
	
	User(int id, String userName, String passWord)
	{
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	int getId()
	{
		return this.id;
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
