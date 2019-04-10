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
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Context con = new Context();
        List<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");

        con.setList(lista);
        System.out.println("Rivinvaihto jokaisen merkin jälkeen:");
        con.setListConverter(new AfterEach());
        System.out.println(con);

        System.out.println("Rivinvaihto joka toisen merkin jälkeen:");
        con.setListConverter(new AfterSecond());
        System.out.println(con);

        System.out.println("Rivinvaihto joka kolmannen merkin jälkeen:");
        con.setListConverter(new AfterThird());
        System.out.println(con);
    }
}
