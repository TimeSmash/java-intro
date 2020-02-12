import java.util.ArrayList;

class MostExpensive {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // Iterate over expenses for-each
    for (double expense : expenses) {
      System.out.println(expense);
      if(expense > mostExpensive){
      mostExpensive = expense;}
    }
    
    System.out.println("most expensive "+mostExpensive);
    
  }
