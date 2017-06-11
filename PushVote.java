/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;
import java.util.*;
import votes.Person;
import votes.Votes;
import votes.InboxTicket;
import votes.ManageVotes;
/**
 *
 * @author admin
 */
public class PushVote extends Thread {
   private Person _person;
   private Thread t;
   private String threadName;
   private InboxTicket  PD;
   private ManageVotes _manager;

   PushVote( String name,  InboxTicket pd){
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
            System.out.println(VoteLang.__t("PERSON")+this._person.getPersonName() + VoteLang.__t("INPUTTED"));
            this._manager.isVoted();
            this._manager.checkVotes();
        }
     }
   }
   public void start(Person _person, ManageVotes _vote)
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