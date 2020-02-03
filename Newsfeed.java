// import the Arrays package here:
import java.util.Arrays;

public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
    
  public String[] getTopics(){
//     State the datatype of elements in array
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
  
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
//  Arrays.toString(), we can see the contents of the array printed out:
   System.out.println(Arrays.toString(topics));
  }
}