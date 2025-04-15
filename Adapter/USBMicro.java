package Adapter;
public class USBMicro implements Charger_Micro{
    @Override
    public void chargeMicroUSB(){
        System.out.println("USB is being charged");
    }
}
