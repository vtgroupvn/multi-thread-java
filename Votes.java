/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;
import votes.Person;
import votes.Pushvote;
/**
 *
 * @author admin
 */
public class Votes {
    private Person[] personList;
    private int totalTicket;
    private int choosePoint;
    private int totalPersonVoted;
    /**
     * @param args the command line arguments
     */
    public void isVoted()
    {
        this.totalPersonVoted++;
    }
    public void createVoteList()
    {
        // TODO code application logic here
        this.personList = new Person[this.totalTicket];
        InboxTicket PD = new InboxTicket();
        Pushvote[] Ticket;
        Ticket = new Pushvote[this.totalTicket];
        for(int i = 0; i < this.totalTicket; i++){
            this.personList[i] = new Person();
            this.personList[i].writeName(Integer.toString(i+1));
            this.personList[i].writeChoise();
            System.out.println("Person: "+this.personList[i].getPersonName()+", ticket choise: " + Integer.toString(this.personList[i].voteValue()));
            Ticket[i] = new Pushvote( "Ticket - " + Integer.toString(i), PD );
            Ticket[i].start(this.personList[i], this);
        }
    }
    public void checkVotes()
    {
        if (this.totalPersonVoted == this.totalTicket)
        {
            if (InboxTicket.pointTotal >= this.choosePoint){
                System.out.println("Total ticket: " + Integer.toString(this.totalPersonVoted) + ", Total poit: " + Integer.toString(InboxTicket.pointTotal) + " => Choose(end votes)");
            }else{
                System.out.println("Total ticket: "+Integer.toString(this.totalPersonVoted) + ", Total poit: " + Integer.toString(InboxTicket.pointTotal) + " < " + Integer.toString(this.choosePoint) + " => Restart votes.");
                InboxTicket.pointTotal = 0;
                this.totalPersonVoted = 0;
                this.createVoteList();
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Votes votes = new Votes();
        votes.totalTicket = 5;
        votes.choosePoint = 3;
        votes.createVoteList();
    }
    
}
