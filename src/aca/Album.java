package aca;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private final int albumId;
	private String albumName;
	List<Song> songList = new ArrayList<Song>();
	
	Album(int lastId)
	{
		this.albumId = lastId;
	}
	
	public int getId()
	{
		return this.albumId;
	}
	
	public String getAlbumName()
	{
		return this.albumName;
	}
	void setAlbumName(String albumName)
	{
		this.albumName = albumName;
	}
}
