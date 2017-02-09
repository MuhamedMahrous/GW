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
public class P extends Element {
    public String text;
    public String color;
    public String font;   

    public P(String Text, String Color , String Font) {
        this.text = Text;
        this.color = Color;
        this.font = Font;
    }
    
}
