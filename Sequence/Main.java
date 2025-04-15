import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ClassA objectA = new ClassA();
        ClassB objectB = new ClassB();

        objectA.setObjectB(objectB);

        int x = 2;

        while(x > 0){
            objectA.methodA(x);
            x--;
        }
    }

}
