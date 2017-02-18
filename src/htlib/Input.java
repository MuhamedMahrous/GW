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
public class Input extends Element {

    private String type;
    private String value;

    public Input(String type, String value) {
        type_check(type);
        this.value = value;
        make_HTML();
    }

    private void type_check(String Type) {

        Type = Type.toLowerCase();
        if (Type.equals("button")
                || Type.equals("checkbox")
                || Type.equals("color")
                || Type.equals("date")
                || Type.equals("datetime-local")
                || Type.equals("email")
                || Type.equals("file")
                || Type.equals("hidden")
                || Type.equals("image")
                || Type.equals("month")
                || Type.equals("number")
                || Type.equals("password")
                || Type.equals("radio")
                || Type.equals("range")
                || Type.equals("reset")
                || Type.equals("search")
                || Type.equals("submit")
                || Type.equals("tel")
                || Type.equals("text")
                || Type.equals("time")
                || Type.equals("url")
                || Type.equals("week")) {
            this.type = Type;
        } else {
            System.err.println("INVALID INPUT TYPE!. TYPE IS SET TO 'text' ");
            this.type = "1";
        }

    }
    private void make_HTML()
    {
    HTML_code="<input type=\""+this.type+"\" value=\""+value+"\">";
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
        make_HTML();
    }

    public void setValue(String value) {
        this.value = value;
        make_HTML();
    }
    
}
