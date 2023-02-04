import java.util.HashMap;
import java.util.Set;

public class TestMap{
  public static void main(String[] args){
    HashMap<String, String> trackList= new HashMap<String,String>();
    trackList.put("Song 1", "Lyrics 1");
    trackList.put("Song 2", "Lyrics 2");
    trackList.put("Song 3", "Lyrics 3");
    trackList.put("Song 4", "Lyrics 4");
    
    Set<String> keys = trackList.keySet();
    for(String key:keys){
      System.out.println(key+" : "+trackList.get(key));
    }
  }
}