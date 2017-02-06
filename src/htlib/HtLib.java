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
public class HtLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Website usr1 = new Website();
        Page pageone = new Page();
        H headerone = new H();
        P paragraphone = new P();
        A anchorone = new A();
        Img imageone = new Img();
        
        headerone.text="Hello Genweb";
        headerone.color="BLACK";
        headerone.font="NEWTIMESROMAN";
        
        paragraphone.text="this is a paragraph";
        paragraphone.color="BLUE";
        paragraphone.font="NEWTIMESROMAN";
        
        anchorone.link="www.google.com";
        
        pageone.title="First page";
        
        pageone.elements.add(headerone);
        pageone.elements.add(paragraphone);
        pageone.elements.add(anchorone);
        pageone.elements.add(imageone);
        
        usr1.pages.add(pageone);
        
        
    }
    
}
