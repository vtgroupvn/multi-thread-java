/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;
import votes.ManageVotes;
import votes.LangItem;
/**
 *
 * @author admin
 */
public class Votes {
    /**
     * @param args the command line arguments
     * 
     * Call any where from your app
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VoteLang._addLange(new LangItem("PERSON", "Person: "));
        VoteLang._addLange(new LangItem("TICKETCHOICE", "ticket choice: "));
        VoteLang._addLange(new LangItem("TICKET", "Ticket - "));
        VoteLang._addLange(new LangItem("TOTAL-TICKET", "Total ticket: "));
        VoteLang._addLange(new LangItem("TOTAL-POINT", "Total point: "));
        VoteLang._addLange(new LangItem("ENDVOTE", "(end votes)"));
        VoteLang._addLange(new LangItem("FOR-VOTER", " for Voter:"));
        VoteLang._addLange(new LangItem("VOTE-RESTART", "Restart votes."));
        VoteLang._addLange(new LangItem("ERROR-PUSH", "Error push."));
        VoteLang._addLange(new LangItem("INPUTTED", " Inputted!"));
        ManageVotes votes = new ManageVotes();
        votes.initVotes("TaCuong[cuongvt2608@gmail.com]", 8, 4);
    }
}
