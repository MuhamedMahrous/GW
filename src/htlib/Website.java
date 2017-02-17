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
public class Website {

    private ArrayList<Page> pages;
    private String directory;
    
    public Website(String Directory) {
        pages = new ArrayList<Page>();
        directory=Directory;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
    
    public void add_page(Page page)
    {
        pages.add(page);
    }
    
    public Page get_page(int index)
    {
        return pages.get(index);
    }
    public void remove_page(int index)
    {
     pages.remove(index);
    }

}
