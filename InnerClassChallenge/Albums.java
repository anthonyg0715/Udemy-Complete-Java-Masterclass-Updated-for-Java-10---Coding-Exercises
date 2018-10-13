import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Albums {

    private String albumTitle;
    private String albumArtist;
    private SongList songs;


    public Albums(String albumTitle, String albumArtist) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        songs = new SongList();
    }

    public String getAlbumArtist(){
        return albumArtist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public boolean addSong(String title, double duration){
        return this.songs.addSong(new Song(title,duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song checked = this.songs.findSong(trackNumber);
        if(checked != null){
            playList.add(checked);
            return true;
        }else{
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedTitle = songs.findSong(title);
        if(checkedTitle == null){
            System.out.println("Song " + checkedTitle + " is not in Album");
            return false;
        }else{
            playList.add(checkedTitle);
            return true;
        }
    }

    //Creating an inner class for our challenge instead of having everything in one class album 
    private class SongList{

        List<Song> addSong;

        public SongList(){
            addSong = new ArrayList<Song>();
        }

        public boolean addSong(Song song){
            if(this.addSong.contains(song)){
                System.out.println("Song " + song + " already exists");
                return false;
            }else{
                System.out.println("Song " + song + "added");
                addSong.add(song);
                return true;
            }
        }

        public Song findSong(String name){
            for(Song s : this.addSong){
                if(s.getTitle().equals(name)){
                    return s;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber-1;
            if((index >0) && (index < addSong.size())){
                addSong.get(index);
            }
            return null;
        }
    }

}
