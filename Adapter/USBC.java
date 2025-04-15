package Adapter;
public class USBC implements Charger_C{
    @Override
    public void chargeUSBC(){
        System.out.println("USB is being charged");
    }
}
