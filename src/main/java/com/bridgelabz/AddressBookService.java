package com.bridgelabz;

import java.sql.Connection;
import java.sql.SQLException;

public class AddressBookService {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
