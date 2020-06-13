package dao;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.sql.*;

public class UserDAO {
    private static Connection connection = null;
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/hero?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private final static String USER = "root";
    private final static String PASSWORD = "123456";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public UserDAO() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean judge(String username, String password) {
        String sql= "select * from user where name='" +username+"' and password='"+password+"'";
        try (Connection connection=getConnection(); Statement s=connection.createStatement()) {
            ResultSet rs=s.executeQuery(sql);
            if(rs.next()){
                return true;
            }else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
}
