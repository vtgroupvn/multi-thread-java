/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;
import java.util.*;
import votes.Person;
import votes.Votes;
/**
 *
 * @author admin
 */

class InboxTicket {
   static int pointTotal;
   public void pushTicket(int _vote){
    try {
         InboxTicket.pointTotal += _vote;         
     } catch (Exception e) {
         System.out.println("Error push.");
     }
   }
}
public class Pushvote extends Thread {
   private Person _person;
   private Thread t;
   private String threadName;
   private InboxTicket  PD;
   private Votes _manager;

   Pushvote( String name,  InboxTicket pd){
       this.threadName = name;
       this.PD = pd;
   }
   public void run() {
     synchronized(this.PD) {
        this.PD.pushTicket(this._person.voteValue());  
        try{
            this.join();
        }catch(Exception e){
        }finally{ 
            System.out.println("Person "+this._person.getPersonName()+" Inputted !");
            this._manager.isVoted();
            this._manager.checkVotes();
        }
     }
   }
   public void start(Person _person, Votes _vote)
   {
      this._person = _person;
      this._manager = _vote;
      if (t == null)
      {
         t = new Thread (this, this.threadName);
         t.start();
      }
   }
}