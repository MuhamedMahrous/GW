/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlib;

import java.io.IOException;

/**
 *
 * @author muhammedmahrous
 */
public class HtLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        
        // For all the below classes use the constructor to intialize the needed attributes.
        Website usr1 = new Website("/home/muhammedmahrous/Desktop");
        Page pageone = new Page("Page one");
        H headerone = new H("Hello Web, or GenWeb!", "BLUE", "NEWTIMESROMAN");
        P paragraphone = new P("this is an auto generated paragraph by our cool GENWEB builder", "BLUE", "NEWTIMESROMAN");
        A anchorone = new A("www.google.com", "CLICK ME!");
        Img imageone = new Img("image.jpg");

        
        //Add the elements to the page, DON'T FORGET TO REPEAT FOR EACH PAGE
        pageone.elements.add(headerone);
        pageone.elements.add(paragraphone);
        pageone.elements.add(anchorone);
        pageone.elements.add(imageone);

        //Add the pages to the website 
        usr1.pages.add(pageone);

        // Make a builder object and pass to it the website, it will build the website
        // and output the HTML files in the website's directory that you specified in the 
        // website's constructor.
        Builder b = new Builder();
        b.build(usr1);

        
    }

}
