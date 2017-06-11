/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;
import java.util.*;

/**
 *
 * @author admin
 */
public class Person {
    private String _personName;
    private int _voteValue;
    public void writeName(String _personName)
    {
        this._personName = _personName;
    }
    public void writeChoise(int _vote)
    {
        this._voteValue = _vote;
    }
    public String getPersonName()
    {
        return this._personName;
    }
    public int voteValue()
    {
        return this._voteValue;
    }
}
