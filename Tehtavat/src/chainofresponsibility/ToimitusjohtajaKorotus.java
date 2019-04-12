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
class ToimitusjohtajaKorotus extends PalkanKorottaja {
    private final double ALLOWABLE = 10;
    public void processRequest(PalkankorotusPyynto request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println(
            "Toimitusjohtaja käsittelee palkankorotukset $" + request.getAmount());
        } else {
            System.out.println("Noin suuresta palkankorotuksesta voit vain haaveilla!");
        }
    }
}
