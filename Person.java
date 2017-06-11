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
    private String personName;
    private int voteValue;
    public void writeName(String _personName)
    {
        this.personName = _personName;
    }
    public void writeChoise()
    {
        int min = 0;
        int max = 2;
        this.voteValue = (int)(Math.random() * max) + min;
    }
    public String getPersonName()
    {
        return this.personName;
    }
    public int voteValue()
    {
        return this.voteValue;
    }
}
