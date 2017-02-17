/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlib;

import java.util.ArrayList;

/**
 *
 * @author muhammedmahrous
 */
public class Page {
    private ArrayList<Element> elements;
    private String title;
    private int index;
    private String HTML_code;

    public Page(String Title,int Index) {
        this.elements = new ArrayList<>();
        this.title=Title;
        this.index=Index;
    }
    
    void add_element(Element e)
    {
        elements.add(e);
        make_page();
    }
    
    void remove_element(int index)
    {
        elements.remove(index);
        make_page();
    }
    Element get_element(int index)
    {   
        return elements.get(index);
    
    }
    public ArrayList<Element> getElements() {
        return elements;
    }

    public String getTitle() {
        return title;
    }

    public int getIndex() {
        return index;
    }

    public String getHTML_code() {
        return HTML_code;
    }

    public void setTitle(String title) {
        this.title = title;
        make_page();
    }

    public void setIndex(int index) {
        this.index = index;
    }
    private void make_page() {
        String page="";
        for (int i = 0; i < this.elements.size(); i++) {
            page+=this.elements.get(i).HTML_code+" \n";
        }
        
        page = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "	<title>" + this.title + "</title>\n"
                + "</head>\n"
                + "<body>\n"
                + page
                + "\n"
                + "</body>\n"
                + "</html>";
        this.HTML_code=page;
    }

    
    
     }
