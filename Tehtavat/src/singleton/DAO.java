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
public class DAO {
    
    private static DAO INSTANCE = null;
    private String connection;
    
    private DAO() {
    }
    
    public static synchronized DAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DAO();
        }
        return INSTANCE;
    }
    
    public void connectDatabase(String username, String password, String database) {
        connection = "uid:" + username + ";pwd:" + password + ";db:" + database;
    }
    
    public String getConnection() {
        return connection;
    }
    
}
