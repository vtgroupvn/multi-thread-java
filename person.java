/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baucu;
import java.util.*;
/**
 *
 * @author admin
 */
public class person {
    private String name;
    public int phieubau;
    public void ghitennguoibau(String name)
    {
        this.name = name;
    }
    public void ghiphieubau()
    {
        int min = 0;
        int max = 2;
        this.phieubau = (int)(Math.random() * max) + min;
    }
    public String getName()
    {
        return this.name;
    }
}
