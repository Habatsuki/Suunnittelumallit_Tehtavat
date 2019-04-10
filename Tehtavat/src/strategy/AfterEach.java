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
import java.util.Iterator;
import java.util.List;

public class AfterEach implements ListConverter {

    @Override
    public String listToString(List list) {
        String palaute = "";
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            palaute += itr.next() + "\n";
        }
        return palaute;
    }
}
