public class Song {

    private String songTitle;
    private double duration;

    public Song(String title, double duration) {
        this.songTitle = title;
        if(duration < 0.0 || duration > 5.60){
          System.out.println("No song is that long");
        }else{
            this.duration = duration;
        }
    }

    public String getTitle() {
        return songTitle;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song " + songTitle + " with a duration of " + duration;
    }
}
