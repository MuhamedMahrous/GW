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
    public ArrayList<Element> elements;
    public String title;
    public int index;

    public Page(String Title,int Index) {
        this.elements = new ArrayList<>();
        this.title=Title;
        this.index=Index;
    }
    
     }
