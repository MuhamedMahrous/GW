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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        // For all the below classes use the constructor to intialize the needed attributes.
        Website usr1 = new Website("/home/muhammedmahrous/Desktop/test");
        Page pageone = new Page("Page one", 0);
        H headerone = new H("Hello Web", "RED", "NEWTIMESROMAN", 1,0);
        H headertwo = new H("Hello Web", "RED", "NEWTIMESROMAN", 2,1);
        H headerthree = new H("Hello Web", "RED", "NEWTIMESROMAN",3, 2);
        H headerfour = new H("Hello Web", "RED", "NEWTIMESROMAN", 4,3);
        H headerfive = new H("Hello Web", "RED", "NEWTIMESROMAN", 5,4);
        H headersix = new H("Hello Web", "RED", "NEWTIMESROMAN", 6,5);
        P paragraphone = new P("this is an auto generated paragraph by our cool GENWEB builder", "BLUE", "NEWTIMESROMAN", 0);
        A anchorone = new A("http://www.google.com", "CLICK ME!", 0);
        Img imageone = new Img("https://www.centreofexcellence.com/app/uploads/2016/09/nlp-diploma-course.jpg", 0);
        Br breakline = new Br();
        Button btn1 = new Button("button", "CLICK THIS BUTTON", 0);

        //Add the elements to the page, DON'T FORGET TO REPEAT FOR EACH PAGE
        pageone.add_element(headerone);
        pageone.add_element(headertwo);
        pageone.add_element(headerthree);
        pageone.add_element(headerfour);
        pageone.add_element(headerfive);
        pageone.add_element(headersix);
        pageone.add_element(paragraphone);
        pageone.add_element(btn1);
        pageone.add_element(breakline);
        pageone.add_element(anchorone);
        pageone.add_element(breakline);
        pageone.add_element(imageone);

        //Add the pages to the website 
        usr1.add_page(pageone);

        // Make a builder object and pass to it the website, it will build the website
        // and output the HTML files in the website's directory that you specified in the 
        // website's constructor.
        Builder b = new Builder();
        b.build(usr1);

    }

}
