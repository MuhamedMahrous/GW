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

    private String text;
    private String color;
    private String font;
    private int size;

    public H(String Text, String Color, String Font, int Size, int Index) {
        this.text =Text;
        this.color =Color;
        this.font =Font;
        this.index =Index;
        this.size = Size;
        make_HTML();
    }

    public String getText() {
        return text;
    }

    public String getColor() {
        return color;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public void setText(String text) {
        this.text = text;
        make_HTML();
    }

    public void setColor(String color) {
        this.color = color;
        make_HTML();
    }

    public void setFont(String font) {
        this.font = font;
        make_HTML();
    }

    public void setSize(int size) {
        this.size = size;
        make_HTML();
    }

    private void make_HTML() {
        HTML_code = "<h" + this.size + " style=\"color:" + this.color + ";font:" + this.font + "\"" + ">" + this.text + "</h" + size + ">";

    }

}
