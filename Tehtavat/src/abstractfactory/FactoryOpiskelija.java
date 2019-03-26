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
public class FactoryOpiskelija extends VaateMaku {

    public Vaate getVaate(String vaateType) {
        if(vaateType.equalsIgnoreCase("LIPPIS")){
         return new AdidasVaateLippis();         
        }else if(vaateType.equalsIgnoreCase("T-PAITA")){
           return new AdidasVaateTPaita();
        }else if(vaateType.equalsIgnoreCase("FARMARIT")){
           return new AdidasVaateFarmari();
        }else if(vaateType.equalsIgnoreCase("KENGAT")){
           return new AdidasVaateKengat();
        }	 
        return null;
    }
}
