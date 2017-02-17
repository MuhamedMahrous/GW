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
public class Button extends Element {

    private String text;
    private String type;

    public Button(String Type, String Text, int Index) {
        type_check(Type);
        this.text = Text;
        this.index = Index;
        make_HTML();
        
    }

    private void type_check(String Type) {

        Type = Type.toLowerCase();
        if (Type.equals("button") || Type.equals("submit") || Type.equals("reset")) {
            this.type = Type;
        } else {
            System.err.println("INVALID BUTTON TYPE!. TYPE IS SET TO 'BUTTON' ");
            this.type = "button";
        }

    }

    public String getText() {
        return text;
    }

    public int getIndex() {
        return index;
    }

    public String getType() {
        return type;
    }

    public String getHTML_code() {
        return HTML_code;
    }

    public void setText(String text) {
        this.text = text;
        make_HTML();
    }

    public void setIndex(int index) {
        this.index = index;
        make_HTML();
    }

    public void setType(String type) {
        this.type = type;
        make_HTML();
    }

    private void make_HTML() {

        HTML_code = "<button " + "type=" + this.type +">" + this.text + "</button>";

    }

}
