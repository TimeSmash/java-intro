import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> food = new ArrayList<String>();
      food.add("potato");
      food.add("ham");
      System.out.println(food);
      System.out.println(food.indexOf("ham"));
      System.out.println(food.get(0));
      food.remove("ham");
      System.out.println(food);
  }
  
}