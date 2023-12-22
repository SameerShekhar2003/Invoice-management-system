package com.highradius.implementation;

import java.util.List;
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.highradius.connection.DatabaseConnection;
import com.highradius.model.Invoice;

public class InvoiceDaoImpl implements InvoiceDao {
	DatabaseConnection dbConnObj= new DatabaseConnection();

	@Override
	public List<Invoice> getInvoice() {
		// TODO Auto-generated method stub
		return dbConnObj.getInvoices();
	}

	@Override
	public Boolean insertInvoice(Invoice obj) {
		// TODO Auto-generated method stub
		return dbConnObj.addInvoice(obj);

	}

	@Override
	public void updateInvoice(int slNo, Invoice inv) {
		try {
	          Class.forName("com.mysql.jdbc.Driver");
	      } catch (ClassNotFoundException e) {
	          e.printStackTrace();
	      }

	      String sql = "UPDATE h2h_oap SET CUSTOMER_ORDER_ID = ?, SALES_ORG = ?, DISTRIBUTION_CHANNEL = ?, DIVISION = ?, RELEASED_CREDIT_VALUE = ?, PURCHASE_ORDER_TYPE = ?, COMPANY_CODE = ?, ORDER_CREATION_DATE = ?, ORDER_CREATION_TIME = ?, CREDIT_CONTROL_AREA = ?, SOLD_TO_PARTY = ?, ORDER_AMOUNT = ?, REQUESTED_DELIVERY_DATE = ?, ORDER_CURRENCY = ?, CREDIT_STATUS = ?, CUSTOMER_NUMBER = ?,AMOUNT_IN_USD = ?, UNIQUE_CUST_ID = ? WHERE Sl_no = ?";
	      try (Connection connection = dbConnObj.connect();
	              PreparedStatement ps = connection.prepareStatement(sql)) {

	    	  ps.setInt(1, inv.getCUSTOMER_ORDER_ID());
	    	  ps.setInt(2, inv.getSALES_ORG());
	    	  ps.setString(3, inv.getDISTRIBUTION_CHANNEL());
	    	  ps.setString(4, inv.getDIVISION());
	    	  ps.setDouble(5, inv.getRELEASED_CREDIT_VALUE());
	    	  ps.setString(6, inv.getPURCHASE_ORDER_TYPE());
	    	  ps.setInt(7, inv.getCOMPANY_CODE());
	    	  ps.setString(8, inv.getORDER_CREATION_DATE());
	    	  ps.setString(9, inv.getORDER_CREATION_TIME());
	    	  ps.setString(10, inv.getCREDIT_CONTROL_AREA());
	    	  ps.setInt(11, inv.getSOLD_TO_PARTY());
	    	  ps.setDouble(12, inv.getORDER_AMOUNT());
	    	  ps.setString(13, inv.getREQUESTED_DELIVERY_DATE());
	    	  ps.setString(14, inv.getORDER_CURRENCY());
	    	  ps.setString(15, inv.getCREDIT_STATUS());
	    	  ps.setInt(16, inv.getCUSTOMER_NUMBER());
	    	  ps.setDouble(17, inv.getAMOUNT_IN_USD());
	    	  ps.setString(18, inv.getUNIQUE_CUST_ID());
	    	  ps.setInt(19, inv.getSl_no());

	    	  ps.executeUpdate();
	         
	      } catch (SQLException e) {
	          e.printStackTrace();
	      }
	}

	@Override
	public void deleteInvoice(int slNo) {
		try {
          Class.forName("com.mysql.jdbc.Driver");
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }

      String sql = "DELETE FROM h2h_oap WHERE Sl_no = ?";

      try (Connection connection = dbConnObj.connect();
              PreparedStatement statement = connection.prepareStatement(sql)) {

          statement.setInt(1, slNo);

          statement.executeUpdate();

      } catch (SQLException e) {
          e.printStackTrace();
      }

	}

}
