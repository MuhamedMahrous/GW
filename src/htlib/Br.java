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
public class Br extends Element{
    
    public Br() {
        make_HTML();
    }

    public String getHTML_code() {
        return HTML_code;
    }
    
    private void make_HTML() {
        HTML_code = "<br>";
    }

    
}
