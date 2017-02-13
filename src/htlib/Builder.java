/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlib;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author muhammedmahrous
 */
public class Builder {

    public void build(Website ws) throws IOException {
        if (!ws.pages.isEmpty()) {
            for (int i = 0; i < ws.pages.size(); i++) {
                String temp_page;
                temp_page = make_page(ws.pages.get(i));
                File temp = new File(ws.directory + "/" + ws.pages.get(i).title + ".html");
                FileWriter writer = new FileWriter(temp);
                writer.write(temp_page);
                writer.close();
            }
        }
    }

    private String make_page(Page p) {
        String page = "";
        ArrayList<Element> elements = p.elements;
        if (!elements.isEmpty()) {
            for (int i = 0; i < elements.size(); i++) {
                Element temp = elements.get(i);
                if (temp.getClass().equals(P.class)) {
                    page += make_paragraph((P) elements.get(i));
                } else if (H.class.isAssignableFrom(temp.getClass())) {
                    page += make_heading((H) elements.get(i));
                } else if (temp.getClass().equals(A.class)) {
                    page += make_anchor((A) elements.get(i));
                } else if (temp.getClass().equals(Img.class)) {
                    page += make_img((Img) elements.get(i));
                } else if (temp.getClass().equals(Br.class)) {
                    page += make_break();
                } else if (temp.getClass().equals(Button.class)) {
                    page += make_button((Button) elements.get(i));
                }
                page += "\n";
            }
        }
        page = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "	<title>" + p.title + "</title>\n"
                + "</head>\n"
                + "<body>\n"
                + page
                + "\n"
                + "</body>\n"
                + "</html>";

        return page;
    }

    private String make_paragraph(P Par) {
        String p;

        p = "<p " + "style=\"color:" + Par.color + ";font:" + Par.font + "\"" + ">" + Par.text + "</p>";

        return p;
    }

    private String make_heading(H Head) {
        String head;
        String size;

        if (Head.getClass().equals(H1.class)) {
            size = "h1";
        } else if (Head.getClass().equals(H2.class)) {
            size = "h2";
        } else if (Head.getClass().equals(H3.class)) {
            size = "h3";
        } else if (Head.getClass().equals(H4.class)) {
            size = "h4";
        } else if (Head.getClass().equals(H5.class)) {
            size = "h5";
        } else if (Head.getClass().equals(H6.class)) {
            size = "h6";
        } else {
            size = "h1";
        }

        head = "<" + size + " style=\"color:" + Head.color + ";font:" + Head.font + "\"" + ">" + Head.text + "</" + size + ">";

        return head;
    }

    private String make_anchor(A Anc) {
        String anc;

        anc = "<a " + "href=\"" + Anc.link + "\"" + ">" + Anc.text + "</a>";

        return anc;
    }

    private String make_img(Img Image) {
        String img;

        img = "<img " + "src=\"" + Image.src + "\"" + ">";

        return img;
    }

    private String make_break() {
        String br;
        br = "<br>";
        return br;
    }

    private String make_button(Button btn) {
        String b;
        b = "<button "+"type="+btn.type+"\">" + btn.text + "</button>";
        return b;
    }
}
