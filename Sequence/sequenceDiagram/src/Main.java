public class Main
{
    public static void main(String[] args)
    {
        ClassA objectA = new ClassA();
        ClassB objectB = new ClassB();
        ClassC objectC = new ClassC();

        objectA.setB(objectB);
        objectB.setObjectA(objectA);
        objectB.setObjectC(objectC);

        String myString = "test";

        objectA.methodA1(5);
        objectB.methodB1(myString);
    }
}
