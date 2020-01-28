   //numbers can be classified into two subtypes
// int = whole number
// double = decimal numbers

public class MultAndDivide {

 
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal + (subtotal*tax);
    System.out.println(total);
    double perPerson = total/4;
    System.out.println(perPerson);
    
    //If a whole number is divided by a decimal and this does not result in an integer, Java will drop the decimal so it becomes an integer
    
     //If a whole number is divided by a decimal and this does not result in an integer, Java will drop the decimal so it becomes an integer
    //This can be avoided if both numbers are doubles. When using variables, if both numbers are doubles division will occur normally.
    //For example
    
    // double varB = 0.5;
    // int varC = 1;
    // int varD = 4;
    // double varE = 1.0;
    // double varF = 4.0;
    
    
    // System.out.println(varA/varB);2.22
    // System.out.println(varA/varC);1.11
    // System.out.println(varA/varB);2.22
    // System.out.println(varC/varD);0
    // System.out.println(varE/varF);0.25
    
    //Uncomment the following lines to further witness this effect

  // Dividing a whole number by decimal   
  // System.out.println(10/4);
    
  // Dividing a decimal by whole number  
    // System.out.println(10.5/4);
    
  // Dividing a decimal by whole decimal    
    // System.out.println(10.777/1.31);
	}
}