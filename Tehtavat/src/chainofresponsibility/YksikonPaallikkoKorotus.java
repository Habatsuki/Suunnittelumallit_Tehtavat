/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author hannu.korhonen
 */
class YksikonPaallikkoKorotus extends PalkanKorottaja {
    private final double ALLOWABLE = 5;
    public void processRequest(PalkankorotusPyynto request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Tuon kokoiset palkankorotukset ovat yksikön päällikön vastuulla $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
