package AddressBook;

import java.lang.Exception;
//import java.io.Serializable;

public class MyException extends Exception {
  
  public void getMessage(String msg)
  {
	  System.out.println(msg);
  }
}
