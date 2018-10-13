import java.util.*;

public class LinkedListChallenge {

    private static ArrayList<Albums> listOfAlbums = new ArrayList<Albums>();

    public static void main(String[] args) {
        Albums album = new Albums("Evil Deeds", "Eminem");
        album.addSong("Evil Deeds",5.60);
        album.addSong("My Name Is", 5.30);
        album.addSong("The Real Slim Shady",5.50);
        listOfAlbums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        listOfAlbums.get(0).addToPlayList("Evil Deeds",playList);
        listOfAlbums.get(0).addToPlayList("My Name Is", playList);
        listOfAlbums.get(0).addToPlayList("The Real Slim Shady",playList);
        play(playList);
    }

    public static void play(LinkedList<Song> playList){
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> songListIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("PlayList is empy");
        }else{
            printMenu();
            //System.out.println("Now Playing: " + songListIterator.next().toString());
        }

        while(!quit){
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(songListIterator.hasNext()){
                            songListIterator.next();

                        }
                        forward = true;
                    }
                    if(songListIterator.hasNext()){
                        System.out.println("Now Playing: " + songListIterator.next().toString());
                    }else{
                        System.out.println("We have reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(songListIterator.hasPrevious()){
                            songListIterator.previous();

                        }
                        forward = false;
                    }
                    if(songListIterator.hasPrevious()){
                        System.out.println("Playing the previous song " + songListIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playList");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(songListIterator.hasPrevious()){
                            System.out.println("Now Replaying " + songListIterator.previous().toString());
                            forward=false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(songListIterator.hasNext()){
                            System.out.println("Now Replaying " + songListIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }


    private static void printList(LinkedList<Song> playList){
        if(playList.isEmpty()){
            System.out.println("Nothing to show");
        }else{
            Iterator<Song> song = playList.iterator();
            while(song.hasNext()){
                System.out.print("List Of Songs");
                System.out.println(song.next());
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Actions\nPress");
        System.out.println("0 - To quit the application\n" +
                           "1 - To go back a song \n" +
                           "2 - To go forward a song \n"+
                           "3 - To loop the current song \n" +
                           "4 - To list songs in the playlist\n" +
                           "5 - To print these instructions again");
    }
}
