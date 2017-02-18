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
public class TextArea extends Element {

    private int rows;
    private int cols;
    private String text;
    private String name;

    public TextArea(int rows, int cols, String text, String name) {
        this.rows = rows;
        this.cols = cols;
        this.text = text;
        this.name = name;
        make_HTML();
    }

    private void make_HTML() {
        HTML_code ="<textarea rows=\"" + this.rows + "\" cols=\"" + this.cols + "\">\n"
                + this.text
                + "</textarea>";
    }

    public String getName() {
        return name;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public String getText() {
        return text;
    }

    public void setCols(int cols) {
        this.cols = cols;
        make_HTML();
    }

    public void setName(String name) {
        this.name = name;
        make_HTML();
        
    }

    public void setRows(int rows) {
        this.rows = rows;
        make_HTML();
    }

    public void setText(String text) {
        this.text = text;
        make_HTML();

    }
    
}
