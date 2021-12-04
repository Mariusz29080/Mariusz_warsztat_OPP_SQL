package pl.coderslab.entity;

import warsztat.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class User {
    private int id;
    private String userName;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        try (Connection connection = DbUtil.getConnection()) {
            System.out.println("Połączenie udane");
        } catch (SQLException e) {
            System.out.println("Jakiś problem z połączeniem, sprawdź czy wszystko działa");
            e.printStackTrace();

        }
    }
}
