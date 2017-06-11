/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;
import votes.ManageVotes;
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
        ManageVotes votes = new ManageVotes();
        votes.initVotes(5, 3);
    }
}
