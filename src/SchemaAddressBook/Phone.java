package SchemaAddressBook;

public enum Phone {

	MOBILE ("1"),
	HOME ("2"),
	FAX ("3");
	private final String shortCode;
	Phone(String code)
	{
		this.shortCode = code;
	}
	public String getType()
	{
		return this.shortCode;
	}
	public void getMessage()
	{
		System.out.println(this.shortCode);
	}

}
