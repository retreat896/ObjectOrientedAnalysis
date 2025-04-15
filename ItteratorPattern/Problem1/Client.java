package ItteratorPattern.Problem1;

public class Client {
    public static void main(String[] args) {   
        int[] numberOfProblems = {1,2,3,4,5,6,7,8,9,10};


        // for(int i = 0; i < numberOfProblems.length; i++) {
        //     numberOfProblems[i] = i + 1;
        // }

        Problem problem = new Problem(numberOfProblems);
        Itterator itterator = problem.Itterator();
        while(itterator.hasNext())
            System.out.println(itterator.next());
    }
    
}
