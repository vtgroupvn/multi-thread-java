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
    private int _pointTotal;
    public void pushTicket(int _vote){
        try {
            this._pointTotal += _vote;         
        } catch (Exception e) {
            System.out.println("Error push.");
        }
    }
    public int getTotalPoint()
    {
        return this._pointTotal;
    }
    public void restoreInbox()
    {
        this._pointTotal = 0;
    }
}
