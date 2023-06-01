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
            String sql = "insert into address_book (first_name, last_name, city, state, zipcode, mobile_number, email) " +
                    "values ('Sriram', 'Ravichandran', 'Bangalore', 'Karnataka', 123456, 1234567890, 'sr@gmail.com')";
            boolean response = stmt.execute(sql);
            System.out.println(response);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
