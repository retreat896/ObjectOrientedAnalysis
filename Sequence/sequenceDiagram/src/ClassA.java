public class ClassA
{
    private ClassB objectB;

    public void setB(ClassB objectB)
    {
        this.objectB = objectB;
    }

    public void methodA1(int numberOfIterations)
    {
        for(int i=0; i<numberOfIterations; i++)
        {
            objectB.showMessage();
        }
    }

    public void showMessage()
    {
        System.out.println("A object!");
    }
}
