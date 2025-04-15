import java.util.Random;

public class ClassB {

    public void methodB(int x){
        Random random = new Random();
        int y = random.nextInt(10);
        x = x + (5 - y);
    }


}
