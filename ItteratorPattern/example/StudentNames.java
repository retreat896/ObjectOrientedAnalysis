package ItteratorPattern.example;

//concrete itteratable, holds what we want to itterate
public class StudentNames implements Itteratable {
    private String[] names;

    public StudentNames(String[] names){
        this.names = names;
    }

    @Override
    public Itterator Itterator() {
        return new ConcreteItterator();
    }

    //concrete itterator
    private class ConcreteItterator implements Itterator{
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < names.length;
        }

        @Override
        public String next() {
            return names[currentIndex++];
        }
    }
}
