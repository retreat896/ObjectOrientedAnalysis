public class ClassA {
    private ClassA objectA;
    private ClassB objectB;

    public void setObjectA(ClassA objectA) {
        this.objectA = objectA;
    }

    public void setObjectB(ClassB objectB) {
        this.objectB = objectB;
    }

    public int methodA(int x) {
        
        if(x == 5){
            objectB.methodB(x);
        }else{
            objectA.methodA(x);
        }

        return x;
        
    }


}
