/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;

/**
 *
 * @author admin
 */
public class InboxTicket {
    static int pointTotal;
    public void pushTicket(int _vote){
        try {
            InboxTicket.pointTotal += _vote;         
        } catch (Exception e) {
            System.out.println("Error push.");
        }
    }
}
