
package phone;
public class PhoneUser {
    private Phone phone;
    
    public PhoneUser(Phone phone){
        this.phone = phone;
        
    }
    void turnOnThePhone(){
        this.phone.powerOn();
    }
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    void makePhoneLouder(){
        this.phone.VolumeUp();
    }
        void makePhoneSilent(){
        this.phone.VolumeDown();
    }
}