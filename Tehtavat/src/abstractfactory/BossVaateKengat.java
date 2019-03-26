/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author hannu.korhonen
 */
public class BossVaateKengat implements Vaate {
    @Override
    public void kuvaileVaate() {
        System.out.println("Boss kengät");
    }
    
    public String toString() {
        return "BOSS kengät";
    }
}
