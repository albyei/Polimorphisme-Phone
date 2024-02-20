package phone;    
    public class Xiaomi implements Phone {
      private int volume;
      private boolean isPowerOn;
      
      public Xiaomi(){
          //set volume awal
          this.volume = 50;
      }
      @Override
      public void powerOn(){
          isPowerOn = true;
          System.out.println("Handphone menyala");
          System.out.println("XIAOMI");
          System.out.println("Android version 29");

      }
      @Override
      public void powerOff(){
          isPowerOn = false;
          System.out.println("Handphone dimatikan");
      }
      @Override
      public void VolumeUp(){
          if(isPowerOn){
              if(this.volume==MAX_VOLUME){
                  System.out.println("Volume Full");
                  System.out.println("sudah" + this.getVolume() + "%");
    
                   } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }  
      @Override
      public void VolumeDown(){
          if(isPowerOn){
              if(this.volume==MAX_VOLUME){
                  System.out.println("Volume Full");
                  System.out.println("sudah" + this.getVolume() + "%");
    
                   } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }  
      
      public int getVolume(){
          return this.volume;
      }
      
              }
          
