package SchemaAddressBook;

public class UserPhone {

	private final int id;
	String mobilPhone;
	String homePhone;
	String faxPhone;
	
	UserPhone(int id)
	{
		this.id = id;
	}
	
	String getMobilPhone()
	{
		return this.mobilPhone;
	}
	String getHomePhone()
	{
		return this.homePhone;
	}
	String getFaxPhone()
	{
		return this.faxPhone;
	}
	void setMobilPhone(String mobilPhone)
	{
		this.mobilPhone = mobilPhone;
	}
	void setHomePhone(String homePhone)
	{
		this.homePhone = homePhone;
	}
	void setFaxPhone(String faxPhone)
	{
		this.faxPhone = faxPhone;
	}
}
