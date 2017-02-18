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
public class UL extends Element {

    private String type;
    private String compact;
    private ArrayList<LI> list_items;

    public UL(String type, String compact) {
        type_check(type);
        this.compact = compact;
        list_items = new ArrayList<>();
    }

    private void type_check(String Type) {

        Type = Type.toLowerCase();
        if (Type.equals("disc") || Type.equals("square") || Type.equals("circle")) {
            this.type = Type;
        } else {
            System.err.println("INVALID LIST TYPE!. TYPE IS SET TO 'disc' ");
            this.type = "disc";
        }

    }

    private void make_HTML() {

        String st1 = "<ul " + "compact=\"" + this.compact + "\" type=\"" + this.type + "\">";
        String st2 = "";
        for (LI list_item : list_items) {
            st2 +=  "\n"+list_item.getHTML_code();
        }
        st2+="\n";
        String st3 = "</ul>";
        HTML_code = st1 + st2 + st3;
    }

    public void add_list_item(LI item) {
        list_items.add(item);
        make_HTML();
    }

    public void remove_list_item(int Index) {
        LI to_be_removed = null;
        for (int i = 0; i < list_items.size(); i++) {
            if (list_items.get(i).getIndex() == Index) {
                to_be_removed = list_items.remove(i);
            }
        }
        make_HTML();
    }

    public LI get_list_item(int Index) {
        LI to_be_returned = null;
        for (int i = 0; i < list_items.size(); i++) {
            if (list_items.get(i).getIndex() == Index) {
                to_be_returned = list_items.get(i);
            }
        }
        return to_be_returned;
    }

    public ArrayList<LI> getList_items() {
        return list_items;
    }
    

}
