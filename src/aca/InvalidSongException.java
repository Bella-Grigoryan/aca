package aca;

public class InvalidSongException extends Exception {

	private String msg;
	InvalidSongException(String msg)
	{
		this.msg = msg;
	}
	
	public void getMsg()
	{
  	     System.out.println(this.msg);
	}

}
