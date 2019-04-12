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
abstract class PalkanKorottaja {
    protected PalkanKorottaja successor;
    
    public void setSuccessor(PalkanKorottaja successor) {
        this.successor = successor;
    }
    
    abstract public void processRequest(PalkankorotusPyynto request);
}

