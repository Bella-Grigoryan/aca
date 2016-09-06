package aca;

import java.util.Date;

public class Artist {

	private final int artistId;
	private String surName;
	private String lastName;
	private Date birthDay;
	
	private String info;
	
	Artist(int lastId, String surName, String lastName, Date birthday, String info)
	{
		this.artistId = lastId;
		this.surName = surName;
		this.lastName = lastName;
		this.birthDay = birthday;
		this.info = info;
	}
	
	public int getId()
	{
		return this.artistId;
	}
	public String getSurName()
	{
		return this.surName;
	}
	public void setSurName(String surName)
	{
		this.surName = surName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public Date getbirthDay()
	{
		return this.birthDay;
	}
	public void setBirthDay(Date birthDay)
	{
		this.birthDay = birthDay;
	}
	
	public int hashCode()
	{
		final int coeff = 31;
		int result = 1;
		result = coeff * result + this.artistId;
		result = coeff * result + this.surName.hashCode();
		result = coeff * result + this.lastName.hashCode();
		result = coeff * result + this.birthDay.hashCode();
		result = coeff * result + this.info.hashCode();
		return result;
	}
	
	public boolean equals(Object obj) 
	{
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Artist artist = (Artist) obj;
		
		boolean bool = false;
		
		if((this.surName == artist.surName || this.surName.equals(artist.surName)) &&
				(this.lastName == artist.lastName || this.lastName.equals(artist.lastName)) &&	
        			this.birthDay == artist.birthDay)
				bool = true;
	
	    return bool;
	}

}
