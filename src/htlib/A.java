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
public class A extends Element {

    private String link;
    private String text;

    public A(String Link, String Text, int Index) {
        this.link = Link;
        this.text = Text;
        this.index = Index;
        make_HTML();
    }

    public String getLink() {
        return link;
    }

    public String getText() {
        return text;
    }

    public void setLink(String link) {
        this.link = link;
        make_HTML();
    }

    public void setText(String text) {
        this.text = text;
        make_HTML();
    }

    private void make_HTML() {

        HTML_code = "<a " + "href=\"" + this.link + "\"" + ">" + this.text + "</a>";

    }

}
