package com.highradius.implementation;

import java.util.List;

import com.highradius.model.Invoice;

public interface InvoiceDao {

	public List<Invoice> getInvoice();
	public Boolean insertInvoice(Invoice obj);
	public void updateInvoice(int slNo,Invoice obj);
	public void deleteInvoice(int slNo);
	
}
