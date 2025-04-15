package ItteratorPattern.Problem1;

public class Problem implements Itteratable {
    private int[] numberOfProblems;

    public Problem(int[] numberOfProblems) {
        this.numberOfProblems = numberOfProblems;
    }

    @Override
    public Itterator Itterator() {
        return new ConcreteItterator();
    }

    private class ConcreteItterator implements Itterator {
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < numberOfProblems.length;
        }

        @Override        
        public int next() {
            return numberOfProblems[currentIndex++];
        }
    }
}
