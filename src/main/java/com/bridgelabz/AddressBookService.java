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
            String sql = "create table address_book " +
                    "(contact_id int not null, " +
                    "first_name varchar(255), " +
                    "last_name varchar(255), " +
                    "city varchar(255), " +
                    "state varchar(255), " +
                    "zipcode int, " +
                    "mobile_number bigint, " +
                    "email varchar(255), " +
                    "primary key ( contact_id ))";
            boolean response = stmt.execute(sql);
            System.out.println(response);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
