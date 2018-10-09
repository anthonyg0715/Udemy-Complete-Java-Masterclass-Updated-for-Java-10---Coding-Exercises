import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Albums {

    private String albumTitle;
    private String albumArtist;
    private List<Song> listOfSongs;

    public Albums(String albumTitle, String albumArtist) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        listOfSongs = new ArrayList<>();
    }

    public String getAlbumArtist(){
        return albumArtist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public List<Song> getListOfSongs() {
        return listOfSongs;
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.listOfSongs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song checkedSongs : this.listOfSongs){
            if(checkedSongs.getTitle().equals(title)){
                return checkedSongs;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.listOfSongs.size())){
            playList.add(this.listOfSongs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedTitle = findSong(title);
        if(checkedTitle == null){
            System.out.println("Song " + checkedTitle + " is not in Album");
            return false;
        }else{
            playList.add(checkedTitle);
            return true;
        }
    }
}
