package com.highradius.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.highradius.model.Invoice;

public class DatabaseConnection {

	
	
    private static final String USER = "root";
    private static final String PASS = "kiit";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/h2h";

    public Connection connect() throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            if (con == null) {
                System.out.println("Connection cannot be established");
            }
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    public List<Invoice> getInvoices() {
        List<Invoice> invoiceList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = connect();
            statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM h2h_oap LIMIT 1000";
            resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                Invoice invoice = new Invoice();
                invoice.setSl_no(resultSet.getInt("Sl_no"));
                invoice.setCUSTOMER_ORDER_ID(resultSet.getInt("CUSTOMER_ORDER_ID"));
                invoice.setSALES_ORG(resultSet.getInt("SALES_ORG"));
                invoice.setDISTRIBUTION_CHANNEL(resultSet.getString("DISTRIBUTION_CHANNEL"));
                invoice.setDIVISION(resultSet.getString("DIVISION"));
                invoice.setRELEASED_CREDIT_VALUE(resultSet.getDouble("RELEASED_CREDIT_VALUE"));
                invoice.setPURCHASE_ORDER_TYPE(resultSet.getString("PURCHASE_ORDER_TYPE"));
                invoice.setCOMPANY_CODE(resultSet.getInt("COMPANY_CODE"));
                
                invoice.setORDER_CREATION_DATE(resultSet.getString("ORDER_CREATION_DATE"));
                invoice.setORDER_CREATION_TIME(resultSet.getString("ORDER_CREATION_TIME"));
                invoice.setCREDIT_CONTROL_AREA(resultSet.getString("CREDIT_CONTROL_AREA"));
                
                invoice.setSOLD_TO_PARTY(resultSet.getInt("SOLD_TO_PARTY"));
                invoice.setORDER_AMOUNT(resultSet.getDouble("ORDER_AMOUNT"));
                
                invoice.setREQUESTED_DELIVERY_DATE(resultSet.getString("REQUESTED_DELIVERY_DATE"));
                invoice.setORDER_CURRENCY(resultSet.getString("ORDER_CURRENCY"));
                invoice.setCREDIT_STATUS(resultSet.getString("CREDIT_STATUS"));
                
                invoice.setCUSTOMER_NUMBER(resultSet.getInt("CUSTOMER_NUMBER"));
                invoice.setAMOUNT_IN_USD(resultSet.getDouble("AMOUNT_IN_USD"));
                invoice.setUNIQUE_CUST_ID(resultSet.getString("UNIQUE_CUST_ID"));
                
                invoiceList.add(invoice);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return invoiceList;
    }

    public boolean addInvoice(Invoice inv) {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = connect();
            String sqlQuery = "INSERT INTO h2h_oap (Sl_no, CUSTOMER_ORDER_ID, SALES_ORG, DISTRIBUTION_CHANNEL, DIVISION, RELEASED_CREDIT_VALUE, PURCHASE_ORDER_TYPE, COMPANY_CODE, ORDER_CREATION_DATE, ORDER_CREATION_TIME, CREDIT_CONTROL_AREA, SOLD_TO_PARTY, ORDER_AMOUNT, REQUESTED_DELIVERY_DATE, ORDER_CURRENCY, CREDIT_STATUS, CUSTOMER_NUMBER, AMOUNT_IN_USD, UNIQUE_CUST_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(sqlQuery);

                       
            ps.setInt(1, inv.getSl_no());
			ps.setInt(2, inv.getCUSTOMER_ORDER_ID());
			ps.setInt(3, inv.getSALES_ORG());
			ps.setString(4, inv.getDISTRIBUTION_CHANNEL());
			ps.setString(5, inv.getDIVISION());
			ps.setDouble(6, inv.getRELEASED_CREDIT_VALUE());	
			ps.setString(7, inv.getPURCHASE_ORDER_TYPE());
			ps.setInt(8, inv.getCOMPANY_CODE());
			ps.setString(9, inv.getORDER_CREATION_DATE());	
			ps.setString(10, inv.getORDER_CREATION_TIME());
			ps.setString(11, inv.getCREDIT_CONTROL_AREA());
			ps.setInt(12, inv.getSOLD_TO_PARTY());	
			ps.setDouble(13, inv.getORDER_AMOUNT());
			ps.setString(14, inv.getREQUESTED_DELIVERY_DATE());
			ps.setString(15, inv.getORDER_CURRENCY());	
			ps.setString(16, inv.getCREDIT_STATUS());
			ps.setInt(17, inv.getCUSTOMER_NUMBER());
			ps.setDouble(18, inv.getAMOUNT_IN_USD());
			ps.setString(19, inv.getUNIQUE_CUST_ID());
			System.out.println(ps);
			ps.executeUpdate();

            int affectedRows = ps.executeUpdate();

            return affectedRows == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
}
