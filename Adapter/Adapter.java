package Adapter;
public class Adapter implements Charger_C, Charger_Micro{
    
    Charger_Micro microUSB = new USBMicro();
    Charger_C usbC = new USBC();

    @Override
    public void chargeMicroUSB(){
        System.out.println("MicroUSB is being charged");
        microUSB.chargeMicroUSB();
        
    }

    @Override
    public void chargeUSBC(){
        System.out.println("USB is being charged");
        usbC.chargeUSBC();
    }  
}
