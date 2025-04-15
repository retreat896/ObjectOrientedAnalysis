package Quiz03;

public class MyPet implements MyPlayable{
    private PetTypes petType;

    @Override
    public void setPetType(PetTypes petType){
        this.petType = petType;
    }
}
