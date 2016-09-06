package aca;

public class Song {

	private final int songId;
	private int albumId;
	private String songName;
	private Artist artist;
	private double songLength;
	
	Song(int lastId, int albumId, Artist artist, double songLength)
	{
		this.songId = lastId;
		this.albumId = albumId;
		this.artist = artist;
		this.songLength = songLength;
	}
	
	public int getAlbumId()
	{
		return this.albumId;
	}
	public void setAlbumId(int albumId)
	{
		this.albumId = albumId;
	}
	public String getSongName()
	{
		return this.songName;
	}
	public void setSongName(String songName)
	{
		this.songName = songName;
	}
	public Artist getArtist()
	{
		return this.artist;
	}
	public void setArtist(Artist artist)
	{
		this.artist = artist;
	}
    public double getSongLength()
    {
    	return this.songLength;
    }
	public void setSongLength(double songLength)
	{
		this.songLength = songLength;
	}
	
	public int hashCode()
	{
		final int coeff = 31;
		int result = 1;
		result = coeff * result + this.songId;
		result = coeff * result + this.albumId;
		result = coeff * result + this.artist.hashCode();
		result = coeff * result + (int) this.songLength;
		return result;
	}
	
	public boolean equals(Object obj) 
	{
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Song song = (Song) obj;
		
		boolean bool = false;
		
		if( this.albumId == song.albumId && (this.artist == song.artist || this.artist.equals(song.artist)) &&
			this.songLength == song.songLength)
				bool = true;
	
	    return bool;
	}
	
}
