package aca;

import onlineshopping.src.am.aca.onlineshopping.common.exception.InvalidUserException;

public interface AlbumRepositoryInterface {

	Song addSong(Song song) throws InvalidSongException;
	
	Song playSong(String albumName, Song song) throws InvalidSongException;
	
	void playAlbum(String albumName);
	
	boolean deleteSong(Song song) throws InvalidSongException;
	
	Song searchSong(String albumName, String songName) throws InvalidSongException;
	
}
