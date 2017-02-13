/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlib;

/**
 *
 * @author muhammedmahrous
 */
public class Button extends Element{
    public String text;
    public int index;
    public String type;
    public Button(String Type,String Text,int Index) {
    Type=Type.toLowerCase();
    if(Type.equals("button")||Type.equals("submit")||Type.equals("reset"))
        this.type=Type;
    else 
    {System.err.println("INVALID BUTTON TYPE!. TYPE IS SET TO 'BUTTON' ");
     this.type="button";
    }
    this.text=Text;
    this.index=Index;
    
    }
    
}
