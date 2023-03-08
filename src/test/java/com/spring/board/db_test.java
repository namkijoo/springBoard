package com.spring.board;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class db_test {
	@Test
	public void test() throws Exception {
	    Class.forName("com.mysql.jdbc.Driver"); 

	    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/board","root","1234"); 
	    System.out.println(con);
	    }
}
