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
public class Jasper {
    static boolean on_opiskelija;
    VaateMaku makuFactory;
    Vaate lippis;
    Vaate kengat;
    Vaate tPaita;
    Vaate farmarit;
    
    public Jasper(boolean bTemp) {
        setOpiskelijaStatus(bTemp);
    }
    
    public void kuvaileVaatteet() {
        System.out.println("Jasperilla on päällä " + lippis + ", " + tPaita + ", " + kengat + " ja " + farmarit);
    }
    
    public void setOpiskelijaStatus(boolean bTemp) {
        on_opiskelija = bTemp;
        //Vaatemaku vaihtuu
        makuFactory = getVaatemaku();
        //Vaihda vaatteet
        setVaatteet();
    }
    
    public void setVaatteet() {
        lippis = makuFactory.getVaate("LIPPIS"); 
        tPaita = makuFactory.getVaate("T-PAITA");
        kengat = makuFactory.getVaate("KENGAT");
        farmarit = makuFactory.getVaate("FARMARIT");
    }
    
    public static VaateMaku getVaatemaku(){   
        if(on_opiskelija){
            return new FactoryOpiskelija();         
        }else{
            return new FactoryInsinoori();
        }
   }
}
