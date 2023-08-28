package SQLIslemleri;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQLBaglanti {
    
    final String KULLANICI_ADI = "root";
    final String PAROLA = "";
    final String HOST = "localhost";
    final String JDBC = "jdbc:mysql://";
    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    final int PORT = 3306;
    
    String DBIsmi;
    String baglantiURL;
    Connection baglanti;
    PreparedStatement komuttamamlayici;

    public SQLBaglanti(String DBIsmi) {
        this.DBIsmi = DBIsmi;
        DBBaglantiKur();
    }
    
    public void DBBaglantiKur(){
        try {
            Class.forName(DRIVER);
            baglantiURL = JDBC + HOST + ":" + PORT + "/" + DBIsmi;
            baglanti = (Connection) DriverManager.getConnection(baglantiURL,KULLANICI_ADI,PAROLA);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLBaglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
