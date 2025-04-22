public class ClassB
{
    private ClassA objectA;
    private ClassC objectC;

    public void setObjectA(ClassA objectA)
    {
        this.objectA = objectA;
    }

    public void setObjectC(ClassC objectC)
    {
        this.objectC = objectC;
    }

    public boolean methodB1(String someString)
    {
        boolean startsWithA = true;

        if(someString.startsWith("A"))
        {
            objectA.showMessage();
        }
        else
        {
            startsWithA = false;
            objectC.showMessage();
        }

        return startsWithA;
    }

    public void showMessage()
    {
        System.out.println("B object!");
    }
}
