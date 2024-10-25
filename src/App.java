import java.util.ArrayList;

public class App {
    public static void main(String[] args)
    {
        // Variable to store the songs
        ArrayList<Song> songs;

        // import the songs from the CSV using the SongImporter
        songs = SongImporter.importSongsFromCSV("songs.csv");

        // Loop across all the songs imported
        int songcnt=0;
        int songsFrom1982=0;
        int songsFrom1998=0;
        int songsFrom2011=0;
        int highDanceability=0;
        Song lowestshake=songs.get(0);
        Song largestlen=songs.get(0);
        Song loudestSong=songs.get(0);
        int[] songsDecade = new int[25];
        double[] decadeObscene = new double[25];
        for (int i=0; i<songs.size(); i++)
        {
            // Get the current song matching the loop index i
            Song s = songs.get(i);
            songcnt++;
            // Check if released in specific year
            if(s.getReleaseDate().equals("1982")){
                songsFrom1982++;
            } else if(s.getReleaseDate().equals("1998")){
                songsFrom1998++;
            } else if(s.getReleaseDate().equals("2011")){
                songsFrom2011++;
            }
            // Check for >0.75 danceability
            Double danse = Double.parseDouble(s.getDanceability());
            double danse2 = danse;
            // System.out.println(danse);
            if(danse2>0.75){
                highDanceability++;
            }
            //Check longest name
            if((Integer.parseInt(largestlen.getLength()))<Integer.parseInt((s.getLength()))){
                largestlen=s;
            }
            //Check for lowest shakability
            Double lowestShake = Double.parseDouble(lowestshake.getShakeTheAudience());
            Double currShake = Double.parseDouble(s.getShakeTheAudience());
            if(currShake<lowestShake){
                lowestshake = s;
            }

            //Check for the loudest song
            Double loudest = Double.parseDouble(loudestSong.getLoudness());
            Double currLoud = Double.parseDouble(s.getLoudness());
            if(loudest<currLoud){
                loudestSong = s;
            }

            // Check for which deacade the song is from
            int currYear=Integer.parseInt(s.getReleaseDate());
            currYear/=10;
            if(currYear/10==19){
                currYear%=10;
                songsDecade[currYear]++;
                decadeObscene[currYear]+=(double) Double.parseDouble(s.getObscene());
            } else{
                currYear%=10;
                songsDecade[10+currYear]++;
                decadeObscene[10+currYear]+=(double) Double.parseDouble(s.getObscene());
            }
            

            // //Example - print the song
            // // You should add code to compute song statistics here.
            // System.out.println("Artist:" + s.getArtist() + s.getReleaseDate());
        }       
        
        System.out.println("Total number of songs: " + songs.size());
        System.out.println("Songs from 1982: " + songsFrom1982 + "\nSongs from 1998: " + songsFrom1998 + "\nSongs from 2011: " + songsFrom2011);
        System.out.println("Songs with Danceability > 0.75: " + highDanceability);
        System.out.println("Song with the largest len: " + (Integer.parseInt(largestlen.getLength())));
        System.out.println("Song with the lowest shakeability score: " + lowestshake.getShakeTheAudience());
        System.out.println("Song with the highest loudness rating: " + loudestSong.getLoudness());
        System.out.println("Average obscentiy each decade: ");
        System.out.println("1950-1959: " + decadeObscene[5]/((double)songsDecade[5]));
        System.out.println("1960-1969: " + decadeObscene[6]/((double)songsDecade[6]));
        System.out.println("1970-1979: " + decadeObscene[7]/((double)songsDecade[7]));
        System.out.println("1980-1989: " + decadeObscene[8]/((double)songsDecade[8]));
        System.out.println("1990-1999: " + decadeObscene[9]/((double)songsDecade[9]));
        System.out.println("2000-2009: " + decadeObscene[10]/((double)songsDecade[10]));
        System.out.println("2010-2019: " + decadeObscene[11]/((double)songsDecade[11]));
    }
    
}

