/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baucu;
import static baucu.Homphieu.tongdiem;
import java.util.*;
import baucu.person;
import baucu.Baucu;
/**
 *
 * @author admin
 */

class Homphieu {
   static int tongdiem;
   public void bophieu(int _phieubau){
    try {
         Homphieu.tongdiem += _phieubau;         
     } catch (Exception e) {
         System.out.println("Lỗi.");
     }
   }
}
public class Bophieu extends Thread {
   private person _person;
   private Thread t;
   private String threadName;
   private Homphieu  PD;
   private Baucu _me;

   Bophieu( String name,  Homphieu pd){
       threadName = name;
       PD = pd;
   }
   public void run() {
     synchronized(PD) {
        PD.bophieu(this._person.phieubau);  
        try{
            this.join();
        }catch(Exception e){
        }finally{ 
            System.out.println("Người "+this._person.getName()+" đã bỏ phiếu!");
            this._me.dabophieu();
            this._me.kiemphieu();
        }
     }
   }
   public void start(person _person, Baucu _baucu)
   {
      this._person = _person;
      this._me = _baucu;
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start();
      }
   }
}