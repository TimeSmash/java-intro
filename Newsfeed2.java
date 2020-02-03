import java.util.Arrays;

public class Newsfeed2 {

public class Newsfeed2 {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;
  
  public Newsfeed2(){
    // Initialize favoriteArticles here:
//     Once you declare this size, it cannot be changed! 
    favoriteArticles = new String[10];
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    // Add newArticle to favoriteArticles:
    favoriteArticles[favoriteIndex] = newArticle;
    
  }

