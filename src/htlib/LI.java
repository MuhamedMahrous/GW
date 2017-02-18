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
public class LI extends Element {

    private int number;
    private String type;
    private String text;

    public LI(int number, String type,String text, int Index) {
        type_check(type);
        this.number = number;
        this.text=text;
        this.index=Index;
        make_HTML();
    }

    private void type_check(String Type) {

        Type = Type.toLowerCase();
        if (Type.equals("1") || Type.equals("A") || Type.equals("a") || Type.equals("I") || Type.equals("i")
                || Type.equals("disc") || Type.equals("square") || Type.equals("circle")) {
            this.type = Type;
        } else {
            System.err.println("INVALID LIST ITEM TYPE!. TYPE IS SET TO '1' ");
            this.type = "1";
        }

    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
        make_HTML();
    }

    public void setType(String type) {
        this.type = type;
        make_HTML();
    }

    private void make_HTML() {

       HTML_code = "<li type=" + this.type +";"+ " number=\"" + this.number + "\">"+this.text+"</li>";

    }

}
