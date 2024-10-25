public class Song
{
  // Private instance variables
  private String title = "Unknown";
  private String artist = "Unknown Artist";
  private String releaseDate = "Unkown";
  private String genre = "Unknown";
  private String length = "Unknown";
  private String shakeTheAudience = "Unknown";
  private String obscene = "Unknown";
  private String danceability = "Unknown";
  private String loudness = "Unknown";
  private String topic = "Unknown";


  // Default constructor
  public Song(){} 

  // Overloaded constructor
  public Song(String artist, String title, String releaseDate, String genre, String length, String shakeTheAudience, String obscene, String danceability, String loudness, String topic) 
  {
    // note usage of this to assign to the instance variables
    this.artist = artist;
    this.title = title;
    this.releaseDate =  releaseDate;
    this.genre = genre;
    this.length = length;
    this.shakeTheAudience = shakeTheAudience;
    this.obscene = obscene;
    this.danceability = danceability;
    this.loudness = loudness;
    this.topic = topic;
  }

  // toString for printing the object
  public String toString()
  {
    return artist + " - " + title + " - " + releaseDate + " - " + genre + " - " + length + " - " + shakeTheAudience + " - " + obscene + " - " + danceability + " - " + loudness + " - " + topic;
  }
  
  // Getters for getting private instance variables
  public String getTitle()
  {
    return title;
  }
  
  public String getArtist()
  {
    return artist;
  }

  public String getReleaseDate()
  {
    return releaseDate;
  }

  public String getGenre()
  {
    return genre;
  }

  public String getLength()
  {
    return length;
  }

  public String getShakeTheAudience()
  {
    return shakeTheAudience;
  }

  public String getObscene(){
    return obscene;
  }

  public String getDanceability(){
    return danceability;
  }

  public String getLoudness(){
    return loudness;
  }

  public String getTopic(){
    return topic;
  }

  // Setters to update instance variables
  public void setTitle(String title)
  {
      this.title = title;
  }
  
  public void setArtist(String artist)
  {
    this.artist = artist;
  }

  public void setReleaseDate(String releaseDate){
    this.releaseDate = releaseDate;
  }

  public void setGenre(String genre){
    this.genre = genre;
  }

}