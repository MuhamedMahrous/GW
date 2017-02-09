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

    public ArrayList<Page> pages;
    String directory;
    public Website(String Directory) {
        pages = new ArrayList<Page>();
        directory=Directory;
    }

}
