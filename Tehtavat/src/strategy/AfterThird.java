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

public class AfterThird implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String palaute = "";
        String[] array = list.toArray(new String[list.size()]);

        for (int i = 0; i < array.length; i++) {
            palaute += list.get(i);
            if ((i + 1) % 3 == 0) {
                palaute += "\n";
            }
        }

        return palaute;
    }
}
