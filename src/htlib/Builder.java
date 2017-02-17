/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlib;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author muhammedmahrous
 */
public class Builder {

    public void build(Website ws) throws IOException {
        if (!ws.getPages().isEmpty()) {
            for (int i = 0; i < ws.getPages().size(); i++) {
                String temp_page;
                temp_page = ws.getPages().get(i).getHTML_code();
                File temp = new File(ws.getDirectory() + "/" + ws.getPages().get(i).getTitle() + ".html");
                FileWriter writer = new FileWriter(temp);
                writer.write(temp_page);
                writer.close();
            }
        }
    }

}
