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
public class Controller {
    
    private static Controller INSTANCE = null;
    private DAO dao;
    
    private Controller() {
        dao = DAO.getInstance();
    }
    
    public static synchronized Controller getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Controller();
        }
        return INSTANCE;
    }
    
    public void connectDatabase(String user, String password, String database) {
        DAO.getInstance().connectDatabase(user, password, database);
    }
    
    public String getConnection() {
        return DAO.getInstance().getConnection();
    }
    
}
