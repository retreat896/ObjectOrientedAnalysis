package Quiz03;

public class ApiPet implements ApiPlayable {
    private int petType;

    @Override 
    public void setPetType(int petType) {
        this.petType = petType;
    }
}
