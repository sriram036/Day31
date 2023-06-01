package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressBookService {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book_service", "root", "Ravi@007");
            Statement stmt = con.createStatement();
            String sql = "update address_book set first_name = 'Preethi' where contact_id = 1";
            boolean response = stmt.execute(sql);
            System.out.println(response);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
