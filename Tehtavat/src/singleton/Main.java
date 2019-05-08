/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author hannu.korhonen
 */
public class Main {
    public static void main(String[] args) {
        //Ensimmäinen control joka luodaan Singletonina
        Controller control = Controller.getInstance();
        String user, password, database;
        
        user = "hannukor";
        password = "passu";
        database = "tietokonekanta";
        
        //Ensimmäinen control yhdistetään databaseen
        control.connectDatabase(user, password, database);
        
        //Vaikka muka luodaan toinen control...
        Controller control2 = Controller.getInstance();
        //connectionin printtaaminen näyttää ensimmäisen controlin connectionin
        System.out.println(control2.getConnection());
        
    }
}
