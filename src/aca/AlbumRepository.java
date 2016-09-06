package aca;

public class AlbumRepository implements AlbumRepositoryInterface {
	   private static AlbumRepositoryInterface instance;

	    public static AlbumRepositoryInterface getInstance(){
	        if(instance==null){
	            instance=new AlbumRepository();
	        }
	        return instance;
	    }

	    private AlbumRepository(){

	    }

		public Song addSong(Song song) throws InvalidSongException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Song playSong(String albumName, Song song) throws InvalidSongException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void playAlbum(String albumName) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean deleteSong(Song song) throws InvalidSongException {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Song searchSong(String albumName, String songName) throws InvalidSongException {
			// TODO Auto-generated method stub
			return null;
		}

}
