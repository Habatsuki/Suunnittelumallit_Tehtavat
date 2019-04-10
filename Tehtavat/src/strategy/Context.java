/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author hannu.korhonen
 */
import java.util.List;

public class Context {
    private ListConverter listC;
    private List list;

    public void setListConverter(ListConverter lc) {
        this.listC = lc;
    }

    public ListConverter getListConverter() {
        return this.listC;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String toString() {
        return listC.listToString(list);
    }
}
