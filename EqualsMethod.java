public class EqualsMethod {
    public static void main(String[] args){
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    //A way to see if two STRINGS are the same is the .equals method
    //A built-in method that compares the value of strings, it's called at the end of a var, using another var as an argument.
   System.out.println(line1.equals(line2));
  System.out.println(line3.equals(line2));}   
}