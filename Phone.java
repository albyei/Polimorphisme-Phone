/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;
public interface Phone {
   int MAX_VOLUME = 100;
   int MIN_VOLUME = 0;
   
   
   void powerOn();
   void powerOff();
   void VolumeUp();
   void VolumeDown();       
    }
    

