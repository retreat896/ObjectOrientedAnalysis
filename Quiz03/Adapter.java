import Quiz03.ApiPlayable;
import Quiz03.MyPlayable;

public class Adapter implements ApiPlayable, MyPlayable {
    private int petType;
    private PetTypes petTypes;

    @Override 
    public void setPetType(int petType) {
        this.petType = petTypes;
    }

    @Override
    public void setPetType(PetTypes petType) {
        this.petType = petType;
    }
}