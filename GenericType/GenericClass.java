package GenericType;
public class GenericClass <E> {
    private E[] array;

    public void setArray(E[] array) {
        this.array = array;
    }

    public int getSize() {
        return array.length;
    }

    public E get(int index) {
        return array[index];
    }

    public Boolean findElemet(E target, E target2) {
        for (E element: array) {
            if (element.equals(target) || element.equals(target2)) {
                System.out.println("Element found");
                return true;
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public GenericClass(){
        
    }
}
