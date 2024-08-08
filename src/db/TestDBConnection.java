package db;

import java.sql.Connection;
import db.DB;


public class TestDBConnection {
    public static void main(String[] args) {
        try {
            Connection conn = DB.getConnection();
            if (conn != null) {
                System.out.println("Conexão bem-sucedida!");
            } else {
                System.out.println("Conexão falhou.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB.closeConnection();
        }
    }
}
