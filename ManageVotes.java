/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;
import votes.Person;
import votes.PushVote;
import votes.InboxTicket;
/**
 *
 * @author admin
 */
public class ManageVotes {
    private Person[] personList;
    private int totalPerson;
    private int choosePoint;
    private int totalPersonVoted;
    private InboxTicket PD;
    private String _voter;
    /**
     * @param args the command line arguments
     */
    public void initVotes(String _voter, int totalPerson, int choosePoint)
    {
        this._voter = _voter;
        this.totalPerson = totalPerson;
        this.choosePoint = choosePoint;
        this.createVoteList();
    }
    public int choiceVoteValue()
    {
        int min = 0;
        int max = 2;
        return (int)(Math.random() * max) + min;
    }
    public void isVoted()
    {
        this.totalPersonVoted++;
    }
    public void createVoteList()
    {
        // TODO code application logic here
        this.personList = new Person[this.totalPerson];
        this.PD = new InboxTicket();
        PushVote[] Ticket = new PushVote[this.totalPerson];
        for(int i = 0; i < this.totalPerson; i++){
            this.personList[i] = new Person();
            this.personList[i].writeName(Integer.toString(i+1));
            this.personList[i].writeChoise(this.choiceVoteValue());
            System.out.println("Person: "+this.personList[i].getPersonName()+", ticket choice: " + Integer.toString(this.personList[i].voteValue()));
            Ticket[i] = new PushVote( "Ticket - " + Integer.toString(i), this.PD );
            Ticket[i].start(this.personList[i], this);
        }
    }
    public void checkVotes()
    {
        if (this.totalPersonVoted == this.totalPerson)
        {
            if (this.PD.getTotalPoint() >= this.choosePoint){
                System.out.println("Total ticket: " + Integer.toString(this.totalPersonVoted) + ", Total point: " + Integer.toString(this.PD.getTotalPoint()) + " for Voter:["+this._voter+"](end votes)");
            }else{
                System.out.println("Total ticket: "+Integer.toString(this.totalPersonVoted) + ", Total point: " + Integer.toString(this.PD.getTotalPoint()) + " < " + Integer.toString(this.choosePoint) + " => Restart votes.");
                this.PD.restoreInbox();
                this.totalPersonVoted = 0;
                this.createVoteList();
            }
        }
    }
}
