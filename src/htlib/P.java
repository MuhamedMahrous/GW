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

    private String text;
    private String color;
    private String font;

    public P(String Text, String Color, String Font,int Index) {
        this.text = Text;
        this.color = Color;
        this.font = Font;
        this.index = Index;
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

    public String getHTML_code() {
        return HTML_code;
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
    
    private void make_HTML() {

        HTML_code = "<p " + "style=color:" + color + ";font:" + font + ">" + text + "</p>";

    }

}
