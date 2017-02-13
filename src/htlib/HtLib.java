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
        Website usr1 = new Website("/home/muhammedmahrous/Desktop/test");
        Page pageone = new Page("Page one", 0);
        H1 headerone = new H1("Hello Web", "RED", "NEWTIMESROMAN", 0);
        H2 headertwo = new H2("Hello Web", "RED", "NEWTIMESROMAN", 1);
        H3 headerthree = new H3("Hello Web", "RED", "NEWTIMESROMAN", 2);
        H4 headerfour = new H4("Hello Web", "RED", "NEWTIMESROMAN", 3);
        H5 headerfive = new H5("Hello Web", "RED", "NEWTIMESROMAN", 4);
        H6 headersix = new H6("Hello Web", "RED", "NEWTIMESROMAN", 5);
        P paragraphone = new P("this is an auto generated paragraph by our cool GENWEB builder", "BLUE", "NEWTIMESROMAN", 0);
        A anchorone = new A("http://www.google.com", "CLICK ME!", 0);
        Img imageone = new Img("https://www.centreofexcellence.com/app/uploads/2016/09/nlp-diploma-course.jpg", 0);
        Br breakline = new Br();
        Button btn1 = new Button("button", "CLICK THIS BUTTON", 0);

        //Add the elements to the page, DON'T FORGET TO REPEAT FOR EACH PAGE
        pageone.elements.add(headerone);
        pageone.elements.add(headertwo);
        pageone.elements.add(headerthree);
        pageone.elements.add(headerfour);
        pageone.elements.add(headerfive);
        pageone.elements.add(headersix);
        pageone.elements.add(paragraphone);
        pageone.elements.add(btn1);
        pageone.elements.add(breakline);
        pageone.elements.add(anchorone);
        pageone.elements.add(breakline);
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
