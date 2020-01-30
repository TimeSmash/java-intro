// This shows how to build a class with methods, instance variables with the this keyword

public class ClassIntro2 {
    public class Dog{
    //Instance variables
    String name;
    String breed;

    //A method, returns a String
    public String getName()
    {
        return name;
    }
    public static void main(String[] args)
    {
        Dog noishe = new Dog("Noishe", "???");
    //methods that internally use the new keyword

        Dog noisheClone = (Dog)noishe.clone();
    }
    }

}