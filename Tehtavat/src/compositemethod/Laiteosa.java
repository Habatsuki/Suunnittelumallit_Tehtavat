/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositemethod;

/**
 *
 * @author hannu.korhonen
 */
public interface Laiteosa {
    public void addOsa(Laiteosa laiteosa);
    public String getNimi();
    public double getHinta();
    public Laiteosa getOsa(int iTemp);
    public void print();
    public double kokonaisHinta();
}
