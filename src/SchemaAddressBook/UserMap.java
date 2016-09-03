package SchemaAddressBook;

import java.util.HashMap;
import java.util.Map;

public class UserMap{
	
	private final int id;
	Map<Integer, String> friendList = new HashMap<Integer, String>();
	
    public UserMap(int id)
    {
    	this.id = id;
    }
	
}
