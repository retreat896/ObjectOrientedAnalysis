package ItteratorPattern.example;

public interface Itterator {
    //return true if we have elemnts in the itteratable
    //if there are elements in the itteratable then dont proceed
    boolean hasNext();

    // return the next element
    String next();

    

}
