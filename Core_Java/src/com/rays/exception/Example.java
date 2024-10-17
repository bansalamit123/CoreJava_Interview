package com.rays.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con = null; 
		try{ 

		     
		      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj4","root","root");
		      } catch(SQLException ex) {
		    	  System.out.println(ex);
		        } finally {    
		            try{
		            	con.close(); // throws an exception     
		           }catch(Exception e){    
		        	   System.out.println(e);
		           }
		     }



	}

}
