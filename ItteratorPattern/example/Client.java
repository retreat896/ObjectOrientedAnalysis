package ItteratorPattern.example;
import java.util.*;
public class Client{
    public static void main(String[] args) {
        //create names
        int numberOfNames = 100;
        String[] names = new String[numberOfNames];
        String[] firstNames = {"John", "Jane", "Bob", "Alice", "Alex", "Emily", "Michael", "Sophia", "William", "Olivia", "Kris"};
        String[] lastNames = {"Doe", "Smith", "Johnson", "Williams", "Brown", "Adams", "Jones", "Miller", "Davis", "Garcia", "Rodriguez"};
        for(int i = 0; i < numberOfNames; i++) {
            Boolean notUniqueName = true;
            while(notUniqueName){
                
            }
            int firstNameIndex = Math.abs((new Random( ).nextInt()) % firstNames.length);
            int lastNameIndex = Math.abs((new Random( ).nextInt()) % lastNames.length);
            //check if array contains this name already and if so, try again

            names[i] = firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];
        }

        StudentNames studentNames = new StudentNames(names);

        Itterator itterator = studentNames.Itterator();

        while(itterator.hasNext()){
            System.out.println(itterator.next());
        }
    }
}
