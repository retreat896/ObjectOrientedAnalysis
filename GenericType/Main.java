package GenericType;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>();

        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        genericClass.setArray(array);
        System.out.println(genericClass.getSize());
        System.out.println(genericClass.findElemet(5, 11));


    }
}
