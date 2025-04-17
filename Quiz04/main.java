package Quiz04;

import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;

public class main implements Iterable<String> {
    private String[] listOfStrings;

    @Override
    public Iterator<String> iterator() {
        return new ConcreteItterator();
    }

    public class ConcreteItterator implements Iterator<String> {
        private int currentIndex = 0;
        public Iterator<String> iterator() {
            return new ConcreteItterator();
        }

        public boolean hasNext() {
            return currentIndex < listOfStrings.length;
        }

        @Override
        public String next() {
            return listOfStrings[currentIndex++];
        }
    }
}
