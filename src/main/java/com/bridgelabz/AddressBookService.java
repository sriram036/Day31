package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressBookService {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root", "Ravi@007");
            Statement stmt = con.createStatement();
            boolean response = stmt.execute("create database address_book_service");
            System.out.println(response);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
