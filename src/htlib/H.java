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
public class H extends Element {

    public String text;
    public String color;
    public String font;

    public H(String Text, String Color, String Font, int Index) {
        this.text = Text;
        this.color = Color;
        this.font = Font;
        this.index = Index;

    }
}
