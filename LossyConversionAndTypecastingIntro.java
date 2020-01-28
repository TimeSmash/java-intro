//The following shows an example of typecasting as a solution to possible lossy conversion

public class LossyConversionAndTypecastingIntro{
    public static void main(String[] args) {   
		int number = 8;
        int a = (int) 176.5+number;
        System.out.println(a);
	}
}

// What is lossy conversion?
// int a = 176.5+number;
  // In this line, a possible lossy conversion is apparent
// This is because you are setting var a as an int, but the result of the operation gives a double(decimal) value.
// There is a possible loss of precision, hence possible lossy conversion
    // int a = 176.5+creditsToGraduate;

//There's two ways to solve this, though. 

// One is by typecasting
// This takes a datatype and converts it into another datatype
    //Size of datatypes:
    // byte -> short -> char -> int -> long -> float -> double
    //The type of typecasting we will perform below is known as narrowing typecasting since we are going to get a double from the operation but convert it to an int
    // It will just end up as 184 and NOT 184.5 since int drops anything after the decimal point
    
    //Another way to do this is just make a of the double datatype
    
//See this link for more info on possible lossy conversion:
// https://stackoverflow.com/questions/34396577/java-jdk-possible-lossy-conversion-from-double-to-int
