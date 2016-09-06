
//<h1>   Musical Application  </h1>
package aca;
public class MusicAppl {
  public static void main(String[] args) throws InvalidSongException
  {
	 try
	 {
		 String curSong = args[0];
	 
	     String curAlbum = args[1];
	     controller(curSong, curAlbum);
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 //
	 }
  }
  
  private static void controller(String songName, String albumName) throws InvalidSongException
  {
	  AlbumRepository curAlbum = null;
	  
	  Song song = curAlbum.searchSong(albumName, songName);
	  
	  curAlbum.playSong(albumName, song);
	  
  }
}
