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
public class Img extends Element {

    private String src;

    public Img(String Src, int Index) {
        this.src = Src;
        this.index = Index;
        this.make_HTML();

    }

    public String getSrc() {
        return src;
    }

    public String getHTML_code() {
        return HTML_code;
    }

    public void setSrc(String src) {
        this.src = src;
        make_HTML();
    }

    public void setHTML_code(String HTML_code) {
        this.HTML_code = HTML_code;
        make_HTML();
    }

    private void make_HTML() {

        this.HTML_code = "<img " + "src=\"" + this.src + "\"" + ">";

    }
}
